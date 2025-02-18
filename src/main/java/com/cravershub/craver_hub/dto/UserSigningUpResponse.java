package com.cravershub.craver_hub.dto;

import java.io.Serializable;

public class UserSigningUpResponse implements DTO, Serializable{
    private Integer customerId;

    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
