package com.example.fitnessapp.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DietProcessRaw {
    private Date date;
    private double weight;
    private double abdominal;
    private double arm;
    private double bodyFat;

    public DietProcessRaw(Date date, double weight, double abdominal, double arm, double bodyFat) throws ParseException {
        this.date = date;
        this.weight = weight;
        this.abdominal = abdominal;
        this.arm = arm;
        this.bodyFat = bodyFat;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAbdominal() {
        return abdominal;
    }

    public void setAbdominal(double abdominal) {
        this.abdominal = abdominal;
    }

    public double getArm() {
        return arm;
    }

    public void setArm(double arm) {
        this.arm = arm;
    }

    public double getBodyFat() {
        return bodyFat;
    }

    public void setBodyFat(double bodyFat) {
        this.bodyFat = bodyFat;
    }

    @Override
    public String toString() {
        return "DietProcessRaw{" +
                "date='" + date + '\'' +
                ", weight='" + weight + '\'' +
                ", abdominal='" + abdominal + '\'' +
                ", arm='" + arm + '\'' +
                ", bodyFat='" + bodyFat + '\'' +
                '}';
    }
}
