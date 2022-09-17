import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //Радиоволна
    @Test
    public void ShouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldSetToMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetToMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    //Уровень громкости

    @Test
    public void ShouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetToMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        int expected = 10;
        int actual = radio.setCurrentVolume(20);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotIncreaseVolumeOverLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.decreaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotDecreaseVolumeBelowLimit() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
