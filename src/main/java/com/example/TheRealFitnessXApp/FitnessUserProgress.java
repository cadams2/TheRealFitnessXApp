package com.example.TheRealFitnessXApp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;


@Entity
public class FitnessUserProgress {

    private float water;
    private int steps;
    private int calories;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(nullable = false)
    private  FitnessUserData user;


    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED", updatable = false)
    private Date created;

    public FitnessUserProgress(){}

    public FitnessUserProgress(float water, int steps, int calories, FitnessUserData user){
        this.water = water;
        this.steps = steps;
        this.calories = calories;
        this.user = user;
    }

    public float getWater() {
        return water;
    }

    public void setWater(float water) {
        this.water = water;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public FitnessUserData getUser() {
        return user;
    }

    public void setUser(FitnessUserData userId) {
        this.user = userId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }



}
