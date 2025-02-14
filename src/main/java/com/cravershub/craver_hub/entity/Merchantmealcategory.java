package com.cravershub.craver_hub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "merchantmealcategory")
public class Merchantmealcategory {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "merchantid")
    private Merchant merchantid;

    @Column(name = "name")
    private Integer name;

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

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

}