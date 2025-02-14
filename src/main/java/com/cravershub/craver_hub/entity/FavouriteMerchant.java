package com.cravershub.craver_hub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "favourite_merchant")
public class FavouriteMerchant {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "merchantid", nullable = false)
    private com.cravershub.craver_hub.entity.Merchant merchantid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerid")
    private Customer customerid;

    public com.cravershub.craver_hub.entity.Merchant getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(com.cravershub.craver_hub.entity.Merchant merchantid) {
        this.merchantid = merchantid;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

}