package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindBeetwinEnds() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 9;
        int actualDay = service.minSales(temps);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindBeetwinEndsMax() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 8;
        int actualDay = service.maxSales(temps);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindBeetwinEndsAmount() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedDay = 180;
        long actualDay = service.salesAmount(temps);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindBeetwinEndsAverageAmount() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedDay = 15;
        long actualDay = service.averageSalesAmount(temps);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindBeetwinEndsMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedDay = 5;
        long actualDay = service.monthsAboveAverage(temps);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindBeetwinEndsMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedDay = 5;
        long actualDay = service.monthsBelowAverage(temps);
        Assertions.assertEquals(expectedDay, actualDay);
    }
}