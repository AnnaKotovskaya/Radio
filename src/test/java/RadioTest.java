import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void validityNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void lessThan0NumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-5);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreThan9NumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(17);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit1ValuesNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit2ValuesNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit3ValuesNumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit4ValuesNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit5ValuesNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit6ValuesNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void next1NumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.next();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void next2NumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void next3NumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void next4NumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void next5NumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

        @Test
    public void prev1NumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prev2NumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prev3NumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prev4NumberStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void validityVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(35);

        int expected = 35;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void lessThan0Volume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-15);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void moreThan100Volume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(133);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit1ValuesVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit2ValuesVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit3ValuesVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(16);

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit4ValuesVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit5ValuesVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void limit6ValuesVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increase1Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(29);

        radio.increaseVolume();

        int expected = 30;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increase2Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increase3Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increase4Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increase5Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduce1Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(53);

        radio.reduceVolume();

        int expected = 52;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduce2Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduce3Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reduce4Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}