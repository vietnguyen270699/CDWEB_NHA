package com.exam.hostelmanager.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fee")
public class FeeEntity extends BaseEntity {

    @Column
    private double price;

    @OneToMany(mappedBy = "feeEntity")
    private List<TransactionHistoryEntity> trasactionlist;

    @OneToMany(mappedBy = "feeEntity")
    private List<PostEntity> postlist;


    public FeeEntity(Long id, Date createDate, String createBy, Date modifyDate, String modifyBy,
                     double price, List<TransactionHistoryEntity> trasactionlist,
                     List<PostEntity> postlist) {
        super(id, createDate, createBy, modifyDate, modifyBy);
        this.price = price;
        this.trasactionlist = trasactionlist;
        this.postlist = postlist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<TransactionHistoryEntity> getTrasactionlist() {
        return trasactionlist;
    }

    public void setTrasactionlist(List<TransactionHistoryEntity> trasactionlist) {
        this.trasactionlist = trasactionlist;
    }

    public List<PostEntity> getPostlist() {
        return postlist;
    }

    public void setPostlist(List<PostEntity> postlist) {
        this.postlist = postlist;
    }


}
