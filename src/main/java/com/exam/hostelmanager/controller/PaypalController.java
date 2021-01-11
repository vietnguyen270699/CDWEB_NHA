package com.exam.hostelmanager.controller;

import com.exam.hostelmanager.entity.OrderPayPal;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.service.UserService;
import com.exam.hostelmanager.service.PayPalService;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
public class PaypalController {

    @Autowired
    private PayPalService service;
    @Autowired
    private UserService userService;


    public static final String SUCCESS_URL = "pay/success";
    public static final String CANCEL_URL = "pay/cancel";
    private double price = 0;

    @GetMapping("/paypal")
    public String homePayPal() {
        return "paypalHome";

    }

    @PostMapping("/pay")
    public String payment(@ModelAttribute("order") OrderPayPal order) {
        try {
            Payment payment = service.createPayment(order.getPrice(), order.getCurrency(), order.getMethod(),
                    order.getIntent(), order.getDescription(), "http://localhost:8080/" + CANCEL_URL,
                    "http://localhost:8080/" + SUCCESS_URL);
            price = order.getPrice();
            System.out.println("PRICE: PRICE PRICE PRICE PRICE \n" + order.getPrice());

            for (Links link : payment.getLinks()) {
                if (link.getRel().equals("approval_url")) {
                    return "redirect:" + link.getHref();
                }
            }

        } catch (PayPalRESTException e) {

            e.printStackTrace();
        }
        return "redirect:/paypal";
    }


    @GetMapping(value = CANCEL_URL)
    public String cancel(RedirectAttributes redirAttrs) {
        redirAttrs.addFlashAttribute("error", "The error XYZ occurred.");

        return "cancelPayPal";
    }

    @GetMapping(value = SUCCESS_URL)
    public String successPay(@RequestParam("paymentId") String paymentId,
                             @RequestParam("PayerID") String payerId,
                             Principal principal, @ModelAttribute("user") UserEntity userEntity,
                             RedirectAttributes redirAttrs) {

        try {
            User user = (User) ((Authentication) principal).getPrincipal();
            UserEntity entity = userService.findByEmail(user.getUsername());
            redirAttrs.addFlashAttribute("success", "Everything went just fine.");

            Payment payment = service.executePayment(paymentId, payerId);
            if (payment.getState().equals("approved")) {
                entity.setMoney(entity.getMoney() + price);

                userService.save(entity, 0);
                return "successPayPal";
            }

        } catch (PayPalRESTException exception) {
            System.out.println(exception.getMessage());
        }

        return "redirect:/paypal";
    }


}
