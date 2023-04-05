package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = 180 / 12;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testMax() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthMaxSale(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMin() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthMinSale(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void saleBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.saleBelowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void saleAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.saleAboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}

