package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumSales();
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageSum();
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.belowAverage();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.aboveAverage();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
