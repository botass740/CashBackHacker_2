package ru.netology.service;

import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRomain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRomainZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRomainBorderUnder() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRomainBorderAbove() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        org.junit.Assert.assertEquals(expected, actual);
    }

    //Тесты с использованием API JUnit Jupiter
    @org.junit.jupiter.api.Test
    public void testRomainJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRomainZeroJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRomainBorderUnderJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRomainBorderAboveJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        Assertions.assertEquals(expected, actual);
    }
}
