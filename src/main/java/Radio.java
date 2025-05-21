public class Radio {
    private int currentStationNumber; // Номер текущей радиостанции
    private int currentVolumeLevel; // Уровень громкости
    private int stationCount; // Количество станций

    // Конструктор по умолчанию
    public Radio() {
        this.stationCount = 10;
        this.currentStationNumber = 0;
        this.currentVolumeLevel = 0;
    }

    // Конструктор с параметром
    public Radio(int stationCount) {
        if (stationCount <= 0) {
            this.stationCount = 10;
        } else {
            this.stationCount = stationCount - 1;
        }
        this.currentStationNumber = 0;
        this.currentVolumeLevel = 0;
    }

    // Гетеры
    public int getStationCount() {
        return stationCount;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    // Установка новой радиостанции
    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > stationCount) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    // Установка нового уровня громкости
    public void setCurrentVolumeLevel(int newCurrentVolumeLevel) {
        if (newCurrentVolumeLevel < 0) {
            return;
        }
        if (newCurrentVolumeLevel > 100) {
            return;
        }
        currentVolumeLevel = newCurrentVolumeLevel;
    }

    // Переключение на следующую радиостанцию
    public void nextStation() {
        if (currentStationNumber == stationCount) {
            currentStationNumber = 0;
        } else {
            currentStationNumber++;
        }
    }

    // Переключение на предыдущую радиостанцию
    public void previousStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = stationCount;
        } else {
            currentStationNumber--;
        }
    }

    // Увеличение громкости на 1
    public void increaseVolume() {
        if (currentVolumeLevel < 100) {
            currentVolumeLevel = currentVolumeLevel + 1;
        }
    }

    // Уменьшение громкости на 1
    public void decreaseVolume() {
        if (currentVolumeLevel > 0) {
            currentVolumeLevel = currentVolumeLevel - 1;
        }
    }
}








