package ru.netology.radioman.radiovolume;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioVolumeTest {
    @Test
    public void shouldIncreaseVolume() {
        RadioVolume radiov = new RadioVolume();

        radiov.currentVolume = 0;
        radiov.increaseVolume();

        int expected = 1;
        int actual = radiov.currentVolume;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        RadioVolume radiov = new RadioVolume();

        radiov.currentVolume = 100;
        radiov.increaseVolume();

        int expected = 100;
        int actual = radiov.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromMax() {
        RadioVolume radiov = new RadioVolume();

        radiov.currentVolume = 100;
        radiov.decreaseVolume();

        int expected = 99;
        int actual = radiov.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromMin() {
        RadioVolume radiov = new RadioVolume();

        radiov.currentVolume = 0;
        radiov.decreaseVolume();

        int expected = 0;
        int actual = radiov.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentVolume() {
        RadioVolume radiov = new RadioVolume();

        radiov.currentVolume = 12;
        radiov.getCurrentVolume();

        int expected = 12;
        int actual = radiov.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
