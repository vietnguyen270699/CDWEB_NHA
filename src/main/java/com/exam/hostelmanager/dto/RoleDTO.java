package com.exam.hostelmanager.dto;

import java.util.Date;

public class RoleDTO extends BaseDTO<RoleDTO>{
    String name;

    public RoleDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
