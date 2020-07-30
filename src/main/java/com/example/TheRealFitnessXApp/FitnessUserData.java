package com.example.TheRealFitnessXApp;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class FitnessUserData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String firstName;
    private String lastName;
    private String email;
    private int weight;
    private int height;
    private String gender;

    private int waterIntake;
    private int dailySteps;
    private int carloriesBurned;

    public FitnessUserData(){};

    public FitnessUserData(String firstName, String lastName, String email, int weight, int height, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public FitnessUserData(int waterIntake, int dailySteps, int carloriesBurned) {
        this.waterIntake = waterIntake;
        this.dailySteps = dailySteps;
        this.carloriesBurned = carloriesBurned;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWaterIntake() {
        return waterIntake;
    }

    public void setWaterIntake(int waterIntake) {
        this.waterIntake = waterIntake;
    }

    public int getDailySteps() {
        return dailySteps;
    }

    public void setDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
    }

    public int getCarloriesBurned() {
        return carloriesBurned;
    }

    public void setCarloriesBurned(int carloriesBurned) {
        this.carloriesBurned = carloriesBurned;
    }




}
