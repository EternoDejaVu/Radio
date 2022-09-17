public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return 9;
        }
        if (newCurrentStation > 9) {
            return 0;
        }
        currentStation = newCurrentStation;
        return newCurrentStation;
    }

    public int setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return 0;
        }
        if (newCurrentVolume > 10) {
            return 10;
        }
        currentVolume = newCurrentVolume;
        return newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}
