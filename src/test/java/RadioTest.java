import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testDefaultConstructor() {
        Radio radio = new Radio(10);
        Assertions.assertEquals(10, radio.getStationCount());
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
        Assertions.assertEquals(0, radio.getCurrentVolumeLevel());
    }

    @Test
    public void testStation() {
        Radio radio = new Radio(15);
        Assertions.assertEquals(15, radio.getStationCount());
        Assertions.assertEquals(0, radio.getCurrentStationNumber());

        // Установка новой радиостанции
        radio.setCurrentStationNumber(14);
        Assertions.assertEquals(14, radio.getCurrentStationNumber());

        radio.setCurrentStationNumber(-1);
        Assertions.assertEquals(14, radio.getCurrentStationNumber());

        radio.setCurrentStationNumber(16);
        Assertions.assertEquals(14, radio.getCurrentStationNumber());

        // Переключение вперед
        radio.setCurrentStationNumber(14);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStationNumber());

        radio.setCurrentStationNumber(5);
        radio.nextStation();
        Assertions.assertEquals(6, radio.getCurrentStationNumber());

        // Переключение назад
        radio.setCurrentStationNumber(0);
        radio.previousStation();
        Assertions.assertEquals(14, radio.getCurrentStationNumber());

        radio.setCurrentStationNumber(5);
        radio.previousStation();
        Assertions.assertEquals(4, radio.getCurrentStationNumber());
    }

    @Test
    public void testCustomConstructorInvalid() {
        Radio radio = new Radio(-5);
        Assertions.assertEquals(10, radio.getStationCount());
    }

    @Test
    public void testVolume() {
        Radio radio = new Radio();

        // Установка громкости
        radio.setCurrentVolumeLevel(-1);
        Assertions.assertEquals(0, radio.getCurrentVolumeLevel());

        radio.setCurrentVolumeLevel(0);
        Assertions.assertEquals(0, radio.getCurrentVolumeLevel());

        radio.setCurrentVolumeLevel(20);
        Assertions.assertEquals(20, radio.getCurrentVolumeLevel());

        radio.setCurrentVolumeLevel(100);
        Assertions.assertEquals(100, radio.getCurrentVolumeLevel());

        radio.setCurrentVolumeLevel(101);
        Assertions.assertEquals(100, radio.getCurrentVolumeLevel());

        // Увеличение громкости
        radio.setCurrentVolumeLevel(20);
        radio.increaseVolume();
        Assertions.assertEquals(21, radio.getCurrentVolumeLevel());

        radio.setCurrentVolumeLevel(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolumeLevel());

        // Уменьшение громкости
        radio.setCurrentVolumeLevel(20);
        radio.decreaseVolume();
        Assertions.assertEquals(19, radio.getCurrentVolumeLevel());

        radio.setCurrentVolumeLevel(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolumeLevel());
    }
}
