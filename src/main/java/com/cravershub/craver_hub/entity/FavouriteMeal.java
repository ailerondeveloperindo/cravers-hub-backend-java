package com.cravershub.craver_hub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "favourite_meal")
public class FavouriteMeal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "favourite_meal_id_gen")
    @SequenceGenerator(name = "favourite_meal_id_gen", sequenceName = "favourite_meal_id_seq", initialValue = 0, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mealid")
    private Meal mealid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerid")
    private Customer customerid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Meal getMealid() {
        return mealid;
    }

    public void setMealid(Meal mealid) {
        this.mealid = mealid;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

}