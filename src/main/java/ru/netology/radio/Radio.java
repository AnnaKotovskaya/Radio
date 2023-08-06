package ru.netology.radio;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor



public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;



    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


       public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

        public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}












