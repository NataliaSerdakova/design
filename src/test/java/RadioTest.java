import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Получение текущего номера радиостанции
    @Test
    public void testCurrentStationNumber() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    // Получение текущего уровня громкости
    @Test
    public void testCurrentVolumeLevel() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    // Установка новой радиостанции
    @Test
    public void newStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);


        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newStationNumber1() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);


        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newStationNumber2() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);


        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newStationNumber3() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);


        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newStationNumber4() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);


        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    // Установка нового уровня громкости
    @Test
    public void newVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(-1);

        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newVolumeLevel1() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(0);

        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newVolumeLevel2() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(20);

        int expected = 20;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newVolumeLevel3() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(100);

        int expected = 100;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newVolumeLevel4() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(101);

        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    // Переключение на следующую радиостанцию
    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation1() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    // Переключение на предыдущую радиостанцию
    @Test
    public void testPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        radio.previousStation();

        int expected = 4;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStation1() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.previousStation();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    // Увеличение громкости на 1
    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(20);
        radio.increaseVolume();

        int expected = 21;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    // Уменьшение громкости на 1
    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(20);
        radio.decreaseVolume();

        int expected = 19;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }
}
