package ru.netology.domain;

public class Radio {
    private int stationNumber;
    private int volume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int countStation) {
        this.maxStation = countStation - 1;
    }

    public void next() {
        if (stationNumber != maxStation) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }
    }

    public void prev() {
        if (stationNumber != 0) {
            stationNumber--;
        } else {
            stationNumber = maxStation;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        } else {
            return;
        }
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber < 0) {
            return;
        }
        if (stationNumber > maxStation) {
            return;
        }
        this.stationNumber = stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }
}

