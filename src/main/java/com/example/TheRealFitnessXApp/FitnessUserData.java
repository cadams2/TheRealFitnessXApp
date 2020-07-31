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

    private float waterIntake;
    private int dailySteps;
    private int caloriesBurned;

    private float recordedWaterIntake;
    private int recordedDailySteps;
    private int recordedCaloriesBurned;

    public FitnessUserData(){};

    public FitnessUserData(String firstName, String lastName, String email, int weight, int height, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public FitnessUserData(float waterIntake, int dailySteps, int caloriesBurned, float recordedWaterIntake, int recordedDailySteps, int recordedCaloriesBurned) {
        this.waterIntake = waterIntake;
        this.dailySteps = dailySteps;
        this.caloriesBurned = caloriesBurned;
        this.recordedWaterIntake = recordedWaterIntake;
        this.recordedDailySteps = recordedDailySteps;
        this.recordedCaloriesBurned = recordedCaloriesBurned;
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

    public float getWaterIntake() {
        return waterIntake;
    }

    public void setWaterIntake(float waterIntake) {
        this.waterIntake = waterIntake;
    }

    public int getDailySteps() {
        return dailySteps;
    }

    public void setDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int carloriesBurned) {
        this.caloriesBurned = carloriesBurned;
    }

    public float getRecordedWaterIntake() {
        return recordedWaterIntake;
    }

    public void setRecordedWaterIntake(float recordedWaterIntake) {
        this.recordedWaterIntake = recordedWaterIntake;
    }

    public int getRecordedDailySteps() {
        return recordedDailySteps;
    }

    public void setRecordedDailySteps(int recordedDailySteps) {
        this.recordedDailySteps = recordedDailySteps;
    }

    public int getRecordedCaloriesBurned() {
        return recordedCaloriesBurned;
    }

    public void setRecordedCaloriesBurned(int recordedCaloriesBurned) {
        this.recordedCaloriesBurned = recordedCaloriesBurned;
    }


}
