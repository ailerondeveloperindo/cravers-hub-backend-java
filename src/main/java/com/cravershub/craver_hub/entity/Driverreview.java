package com.cravershub.craver_hub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "driverreview")
public class Driverreview {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "driverid", nullable = false)
    private Driver driverid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customerid", nullable = false)
    private Customer customerid;

    @Column(name = "review", length = Integer.MAX_VALUE)
    private String review;

    @Column(name = "reviewscore")
    private Integer reviewscore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Driver getDriverid() {
        return driverid;
    }

    public void setDriverid(Driver driverid) {
        this.driverid = driverid;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Integer getReviewscore() {
        return reviewscore;
    }

    public void setReviewscore(Integer reviewscore) {
        this.reviewscore = reviewscore;
    }

}