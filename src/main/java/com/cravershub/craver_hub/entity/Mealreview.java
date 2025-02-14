package com.cravershub.craver_hub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mealreview")
public class Mealreview {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mealid", nullable = false)
    private Meal mealid;

    @Column(name = "review", length = Integer.MAX_VALUE)
    private String review;

    @Column(name = "reviewscore", nullable = false)
    private Integer reviewscore;

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