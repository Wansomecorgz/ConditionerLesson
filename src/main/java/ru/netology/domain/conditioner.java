package ru.netology.domain;

public class conditioner {

    public int currentTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature < 0) {
            return;
        }
        if (currentTemperature > 30) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public void setToMax() {
        currentTemperature = 30;
    }

    public void increase50p() {
        int newCurrentTemperature = currentTemperature * 150 / 100;
       // this.currentTemperature = newCurrentTemperature;
        setCurrentTemperature(newCurrentTemperature);
    }
}
