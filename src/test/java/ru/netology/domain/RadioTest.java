package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationConstructor() {
        Radio radio = new Radio(100);

        radio.setStationNumber(99);
        int expected = 99;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setStationNumber(2);
        int expected = 2;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeZeroIfBelowLowerStation() {
        Radio radio = new Radio();
        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeZeroIfAboveHighestStation() {
        Radio radio = new Radio();
        radio.setStationNumber(10);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowBorderStationTestIf0() {
        Radio radio = new Radio();
        radio.setStationNumber(0);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowBorderStationTestIf1() {
        Radio radio = new Radio();
        radio.setStationNumber(1);

        int expected = 1;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highBorderStationTestIf8() {
        Radio radio = new Radio();
        radio.setStationNumber(8);

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highBorderStationTestIf9() {
        Radio radio = new Radio();
        radio.setStationNumber(9);

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);

        int expected = 50;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulBeZeroIfBelowLowerVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeZeroIfAboveHighestVolume() {
        Radio radio = new Radio();
        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowBorderVolumeTestIf0() {
        Radio radio = new Radio();
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowBorderVolumeTestIf1() {
        Radio radio = new Radio();
        radio.setVolume(1);

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highBorderVolumeTestIf99() {
        Radio radio = new Radio();
        radio.setVolume(99);

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highBorderVolumeTestIf100() {
        Radio radio = new Radio();
        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(2);

        radio.next();

        int expected = 3;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowBorderNextButtonTestIf0() {
        Radio radio = new Radio();
        radio.setStationNumber(0);

        radio.next();

        int expected = 1;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowBorderNextButtonTestIf1() {
        Radio radio = new Radio();
        radio.setStationNumber(1);

        radio.next();

        int expected = 2;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highBorderNextButtonTestIf8() {
        Radio radio = new Radio();
        radio.setStationNumber(8);

        radio.next();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highBorderNextButtonTestIf9() {
        Radio radio = new Radio();
        radio.setStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowBorderPrevButtonTestIf1() {
        Radio radio = new Radio();
        radio.setStationNumber(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowBorderPrevButtonTestIf0() {
        Radio radio = new Radio();
        radio.setStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highBorderPrevButtonTestIf9() {
        Radio radio = new Radio();
        radio.setStationNumber(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highBorderPrevButtonTestIf8() {
        Radio radio = new Radio();
        radio.setStationNumber(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);

        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowBorderIncreaseVolumeTestIf0() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowBorderIncreaseVolumeTestIf1() {
        Radio radio = new Radio();
        radio.setVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highBorderIncreaseVolumeTestIf99() {
        Radio radio = new Radio();
        radio.setVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(49);

        radio.decreaseVolume();

        int expected = 48;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowBorderDecreaseVolumeTestIf1() {
        Radio radio = new Radio();
        radio.setVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highBorderDecreaseVolumeTestIf100() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highBorderDecreaseVolumeTestIf99() {
        Radio radio = new Radio();
        radio.setVolume(99);

        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
