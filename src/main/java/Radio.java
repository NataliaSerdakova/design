public class Radio {
    public int currentStationNumber; // Номер текущей радиостанции
    public int currentVolumeLevel;   // Уровень громкости

    public Radio() {
        this.currentStationNumber = 0;
        this.currentVolumeLevel = 0;
    }

    // Получение текущего номера радиостанции
    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    // Получение текущего уровня громкости
    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    // Установка новой радиостанции
    public void setCurrentStationNumber(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        currentStationNumber = station;
    }

    // Установка нового уровня громкости
    public void setCurrentVolumeLevel(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        currentVolumeLevel = volume;
    }

    // Переключение на следующую радиостанцию
    public void nextStation() {
        if (currentStationNumber == 9) {
            currentStationNumber = 0;
        } else {
            currentStationNumber++;
        }
    }

    // Переключение на предыдущую радиостанцию
    public void previousStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
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








