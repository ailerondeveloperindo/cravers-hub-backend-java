package com.cravershub.craver_hub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "favourite_meal")
public class FavouriteMeal {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mealid")
    private com.cravershub.craver_hub.entity.Meal mealid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerid")
    private Customer customerid;

    public com.cravershub.craver_hub.entity.Meal getMealid() {
        return mealid;
    }

    public void setMealid(com.cravershub.craver_hub.entity.Meal mealid) {
        this.mealid = mealid;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

}