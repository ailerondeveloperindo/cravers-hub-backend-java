package com.cravershub.craver_hub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "favourite_merchant")
public class FavouriteMerchant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "favourite_merchant_id_gen")
    @SequenceGenerator(name = "favourite_merchant_id_gen", sequenceName = "favourite_merchant_id_seq", initialValue = 0, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "merchantid", nullable = false)
    private Merchant merchantid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerid")
    private Customer customerid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Merchant getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Merchant merchantid) {
        this.merchantid = merchantid;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

}