package ru.netology.radioman.radiovolume;

public class RadioVolume {
    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            return;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
