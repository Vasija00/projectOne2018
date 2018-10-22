package com.iesemilidarder.dbonnin.data;

import com.iesemilidarder.dbonnin.AppConstants;
import com.iesemilidarder.dbonnin.exception.IESMyException;

public abstract class Vehicle {
    private String name;
    private Integer duration;
    private String color;
    private Integer numWheels;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() { return duration; }

    public void setDuration(Integer duration) {
        if (duration == null || duration > AppConstants.MAX_DURATION) {
            throw new IESMyException("Te has quedado corto!!");
        }
    }

    public Integer getNumWheels() { return numWheels; }

    public void setNumWheels(Integer numWheels) {
        if (numWheels == null || numWheels > AppConstants.MAX_WHEELS) {
            throw new IESMyException("Demasiadas ruedas nen!");
        }
        this.numWheels = numWheels;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void start();

    public void brake() {
        doLog("he frenado");
    }

    /**
     *
     * @param message
     */

    protected void doLog(String message) {
        System.out.println(message);
    }

    private String showLog(String message) {
        doLog(message);
        return message;
    }
}
