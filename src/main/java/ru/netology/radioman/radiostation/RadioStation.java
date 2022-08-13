package ru.netology.radioman.radiostation;

public class RadioStation {
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;

    public RadioStation(int minRadioStation, int maxRadioStation) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = minRadioStation;
    }

    public RadioStation() {
        return;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {

        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = 0;
        }

    }

    public void prevRadioStation() {

        if (currentRadioStation == 0) {
            currentRadioStation = maxRadioStation;
        }
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }


    }

}
