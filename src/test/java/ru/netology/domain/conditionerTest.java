package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class conditionerTest {
    @Test
    public void test15() {
        conditioner cond = new conditioner();

        cond.currentTemperature = 15;

        int expected = 15;
        int actual = cond.currentTemperature;

        assertEquals(expected, actual);
    }

    @Test
    public void test35() {
        conditioner cond = new conditioner();

        //cond.currentTemperature = 35;
        cond.setCurrentTemperature(35);

        int expected = 0;
        int actual = cond.getCurrentTemperature(); //cond.currentTemperature;

        assertEquals(expected, actual);
    }

    @Test
    public void testToMax() {
        conditioner cond = new conditioner();
        cond.setToMax();

        int expected = 30;
        int actual = cond.getCurrentTemperature();

        assertEquals(expected, actual);
    }

    @Test
    public void testPercentage() {
        conditioner cond = new conditioner();
        cond.setCurrentTemperature(24);

        cond.increase50p();

        int expected = 24;
        int actual = cond.getCurrentTemperature();

        assertEquals(expected, actual);
    }

}