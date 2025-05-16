public class Radio {
    private int currentStationNumber; // Номер текущей радиостанции
    private int currentVolumeLevel;   // Уровень громкости

    // Получение текущего номера радиостанции
    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    // Получение текущего уровня громкости
    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    // Установка новой радиостанции
    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > 9) {
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








