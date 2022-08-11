package ru.netology.radioman.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 0;
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.currentVolume = 10;
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeFromMax() {
        Radio radio = new Radio();

        radio.currentVolume = 10;
        radio.decreaseVolume();

        int expected =9;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromMin() {
        Radio radio = new Radio();

        radio.currentVolume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldCheckNextRadioStationInMin() {
        Radio radio = new Radio();

        radio.currentRadioStation = 0;
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCheckNextRadioStationInMax() {
        Radio radio = new Radio();

        radio.currentRadioStation = 9;
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCheckPrevRadioStationInMax() {
        Radio radio = new Radio();

        radio.currentRadioStation = 9;
        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCheckPrevRadioStationInMin() {
        Radio radio = new Radio();

        radio.currentRadioStation = 0;
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

}
