package ru.netology;

import java.util.Stack;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public void setMaxTemperature(int maxTemperature) {this.maxTemperature = maxTemperature;}
    public void setMinTemperature(int minTemperature) {this.minTemperature = minTemperature;}
    public int getCurrentTemperature() {return currentTemperature;}
    public void setCurrentTemperature(int currentTemperature) {this.currentTemperature = currentTemperature;}

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature++;
        this.currentTemperature = currentTemperature;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature--;
        this.currentTemperature = currentTemperature;
    }
}

