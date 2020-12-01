package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int numberOfRadioStation;
    private int firstRadioStation = 0;
    private int lastRadioStation = 10;
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;


    public Radio(int currentRadioStation, int numberOfRadioStation, int firstRadioStation, int lastRadioStation) {

        if (currentRadioStation > lastRadioStation)
            return;
        if (currentRadioStation < firstRadioStation)
            return;

        this.currentRadioStation = currentRadioStation;
        this.numberOfRadioStation = numberOfRadioStation;
        this.firstRadioStation = firstRadioStation;
        this.lastRadioStation = lastRadioStation;

    }

    public void changeNextRadioStation() {
        if (currentRadioStation == lastRadioStation) {
            this.currentRadioStation = firstRadioStation;
        } else {
            currentRadioStation++;
        }
    }

    public void changePrevRadioStation() {
        if (currentRadioStation == firstRadioStation) {
            this.currentRadioStation = lastRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getFirstRadioStation() {
        return firstRadioStation;
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public int getAmountRadioStation() {
        return numberOfRadioStation;
    }


    public Radio(int currentSoundVolume, int minSoundVolume, int maxSoundVolume) {

        if (currentSoundVolume > maxSoundVolume)
            return;
        if (currentSoundVolume < minSoundVolume)
            return;

        this.currentSoundVolume = currentSoundVolume;
        this.minSoundVolume = minSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
    }

    public void increaseCurrentSoundVolume() {
        if (currentSoundVolume < maxSoundVolume)
            currentSoundVolume++;
    }

    public void decreaseCurrentSoundVolume() {
        if (currentSoundVolume > minSoundVolume)
            currentSoundVolume--;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }


}
