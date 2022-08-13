package ru.netology.radioman.radiostation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioStationTest {

    @Test
    public void shouldSetRadioStation() {
        RadioStation radios = new RadioStation(1, 10);

        Assertions.assertEquals(1, radios.getMinRadioStation());
        Assertions.assertEquals(10, radios.getMaxRadioStation());
        Assertions.assertEquals(1, radios.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationAboveLimit() {
        RadioStation radios = new RadioStation(0, 100);

        Assertions.assertEquals(0, radios.getMinRadioStation());
        Assertions.assertEquals(100, radios.getMaxRadioStation());
        Assertions.assertEquals(0, radios.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationByDefault() {
        RadioStation radios = new RadioStation();

        Assertions.assertEquals(10, radios.getMaxRadioStation());
    }

    @Test
    public void shouldCheckNextRadioStationInMin() {
        RadioStation radios = new RadioStation();

        radios.nextRadioStation(); {
            int currentRadioStation = 0;
            int maxRadioStation = 10;
        }

        int expected = 1;
        int actual = radios.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCheckNextRadioStationInMax() {
        RadioStation radios = new RadioStation();

        radios.nextRadioStation(); {
            int currentRadioStation = 10;
            int maxRadioStation = 10;
        }

        int expected = 0;
        int actual = radios.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCheckPrevRadioStationInMax() {
        RadioStation radios = new RadioStation();

        radios.prevRadioStation(); {
            int currentRadioStation = 9;
            int maxRadioStation = 10;
        }

        int expected = 8;
        int actual = radios.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCheckPrevRadioStationInMin() {
        RadioStation radios = new RadioStation();

        radios.prevRadioStation(); {
            int currentRadioStation = 0;
            int maxRadioStation = 10;
        }

        int expected = 9;
        int actual = radios.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}
