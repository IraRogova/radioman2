package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldChangeNumberOfRadioStation() {
        Radio radio = new Radio(0, 15, 0, 15, 0, 0, 100);

        assertEquals(15, radio.getNumberOfRadioStation());
    }


    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio(8,10, 0, 10,0,0,100);

        assertEquals(8, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldSetCurrentRadioStationFirst() {
        Radio radio = new Radio(0, 10,0, 10,0,100,0);

        assertEquals(0, radio.getFirstRadioStation());

    }

    @Test
    public void shouldSetCurrentRadioStationLast() {
        Radio radio = new Radio(10, 10,0, 10,0,0,100);

        assertEquals(10, radio.getLastRadioStation());
    }


    @Test
    public void shouldChangeNextRadioStationFirst() {
        Radio radio = new Radio(0, 10,0, 10,0,0,100);

        radio.changeNextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldSetCurrentRadioStationUnderFirst() {
        Radio radio = new Radio(-1, 10,0, 10,0,0,100);

        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldChangeNextRadioStationLast() {
        Radio radio = new Radio(10, 10,0, 10,0,0,100);

        radio.changeNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldSetCurrentRadioStationAfterLast() {
        Radio radio = new Radio(16,15,0, 15,0,0,100);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangePrevRadioStationUnderFirst() {
        Radio radio = new Radio(1, 12,0, 12,0,0,100);

        radio.changePrevRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangePrevRadioStationBetweenLastFirst() {
        Radio radio = new Radio(5, 12,0, 12,0,0,100);

        radio.changePrevRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());

    }


    @Test
    public void shouldSetCurrentSoundVolume() {
        Radio radio = new Radio(0,0,0,10,8, 0, 100);

        assertEquals(8, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldChangeNextRadioStationPreLast() {
        Radio radio = new Radio(14, 15,0, 15,0,0,100);

        radio.changeNextRadioStation();
        assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeNextRadioStationBetweenLastFirst() {
        Radio radio = new Radio(10, 15,0, 15,0,0,100);

        radio.changeNextRadioStation();
        assertEquals(11, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentSoundVolumeMax() {
        Radio radio = new Radio(0,0,0,10,100, 0, 100);

        assertEquals(100, radio.getMaxSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeOverMax() {
        Radio radio = new Radio(0,0,0,10,101, 0, 100);

        assertEquals(0, radio.getCurrentSoundVolume());

    }

    @Test
    public void shouldDecreaseCurrentSoundVolume() {
        Radio radio = new Radio(0,0,0,10,56, 0, 100);

        radio.decreaseCurrentSoundVolume();
        assertEquals(55, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldDecreaseCurrentSoundVolumeMin() {
        Radio radio = new Radio(0,0,0,10,0, 0, 100);

        radio.decreaseCurrentSoundVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }


    @Test
    public void shouldSetCurrentSoundVolumeMin() {
        Radio radio = new Radio(0,0,0,10,0, 0, 100);

        assertEquals(0, radio.getMinSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUnderMin() {
        Radio radio = new Radio(0,0,0,10,-1, 0, 100);

        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldIncreaseCurrentSoundVolume() {
        Radio radio = new Radio(0,0,0,10,49, 0, 100);

        radio.increaseCurrentSoundVolume();
        assertEquals(50, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldIncreaseCurrentSoundVolumeMax() {
        Radio radio = new Radio(0,0,0,10,100, 0, 100);

        radio.increaseCurrentSoundVolume();
        assertEquals(100, radio.getCurrentSoundVolume());
    }


    @Test
    public void shouldChangePrevRadioStationLast() {
        Radio radio = new Radio(14, 15,0, 15,0,0,100);

        radio.changePrevRadioStation();
        assertEquals(13, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangePrevRadioStationFirst() {
        Radio radio = new Radio(0, 14,0, 14,0,0,100);

        radio.changePrevRadioStation();
        assertEquals(14, radio.getCurrentRadioStation());

    }

}