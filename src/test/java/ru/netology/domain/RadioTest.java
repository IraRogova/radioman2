package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(4);
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationFirst() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getFirstRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationLast() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getLastRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationAfterLast() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationUnderFirst() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }



    @Test
    public void shouldChangeNextRadioStationFirst() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.changeNextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeNextRadioStationLast() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());

        radio.changeNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangePrevRadioStationUnderFirst() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        assertEquals(1, radio.getCurrentRadioStation());

        radio.changePrevRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangePrevRadioStationBetweenLastFirst() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);
        assertEquals(6, radio.getCurrentRadioStation());

        radio.changePrevRadioStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }



    @Test
    public void shouldSetCurrentSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        assertEquals(0, radio.getCurrentSoundVolume());

        radio.setCurrentSoundVolume(5);
        assertEquals(5, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldChangeNextRadioStationPreLast() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        assertEquals(8, radio.getCurrentRadioStation());

        radio.changeNextRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeNextRadioStationBetweenLastFirst() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);
        assertEquals(6, radio.getCurrentRadioStation());

        radio.changeNextRadioStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentSoundVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        assertEquals(0, radio.getCurrentSoundVolume());

        radio.setCurrentSoundVolume(10);
        assertEquals(10, radio.getMaxSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        assertEquals(0, radio.getCurrentSoundVolume());

        radio.setCurrentSoundVolume(11);
        assertEquals(0, radio.getCurrentSoundVolume());

    }

    @Test
    public void shouldDecreaseCurrentSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(6);
        assertEquals(6, radio.getCurrentSoundVolume());

        radio.decreaseCurrentSoundVolume();
        assertEquals(5, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldDecreaseCurrentSoundVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        assertEquals(0, radio.getCurrentSoundVolume());

        radio.decreaseCurrentSoundVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }


    @Test
    public void shouldSetCurrentSoundVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        assertEquals(0, radio.getCurrentSoundVolume());

        radio.setCurrentSoundVolume(0);
        assertEquals(0, radio.getMinSoundVolume());
    }

    @Test
    public void shouldSetCurrentSoundVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        assertEquals(0, radio.getCurrentSoundVolume());

        radio.setCurrentSoundVolume(-1);
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldIncreaseCurrentSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(7);
        assertEquals(7, radio.getCurrentSoundVolume());

        radio.increaseCurrentSoundVolume();
        assertEquals(8, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldIncreaseCurrentSoundVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(10);
        assertEquals(10, radio.getCurrentSoundVolume());

        radio.increaseCurrentSoundVolume();
        assertEquals(10, radio.getCurrentSoundVolume());
    }


    @Test
    public void shouldChangePrevRadioStationLast() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());

        radio.changePrevRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangePrevRadioStationFirst() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());

        radio.changePrevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

}