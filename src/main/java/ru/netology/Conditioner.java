package ru.netology;

import java.util.Stack;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public int getMaxTemperature() {return maxTemperature;}
    public void setMaxTemperature(int maxTemperature) {this.maxTemperature = maxTemperature;}
    public int getMinTemperature() {return minTemperature;}
    public void setMinTemperature(int minTemperature) {this.minTemperature = minTemperature;}
    public int getCurrentTemperature() {return currentTemperature;}
    public void setCurrentTemperature(int currentTemperature) {this.currentTemperature = currentTemperature;}

    public void increaseCurrentTemperature() {
        for (int temp = 1; ; temp++) {
            if (currentTemperature >= maxTemperature) {
                return;
            }
            currentTemperature++;
            System.out.print(currentTemperature+",");
            this.maxTemperature = maxTemperature;
            this.currentTemperature = currentTemperature;
        }
    }
    public void decreaseCurrentTemperature() {
        for (int temp = 1; ; temp++) {
            if (currentTemperature <= minTemperature) {
                return;
            }
            currentTemperature--;
            System.out.print(currentTemperature+",");
            this.minTemperature = minTemperature;
            this.currentTemperature = currentTemperature;
        }
    }
}

