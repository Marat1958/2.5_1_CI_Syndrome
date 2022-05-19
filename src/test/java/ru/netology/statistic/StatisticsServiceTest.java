package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 3;
        long actual = service.findMin(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findSum() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 85;
        long actual = service.findSum(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAverage() {
        StatisticsService service = new StatisticsService();
        double[] incomesInBillions = {12.0, 5.0, 8.0, 4.0, 5.0, 3.0, 8.0, 6.0, 11.0, 11.0, 12.0};
        double expected = (12.0 + 5.0 + 8.0 + 4.0 + 5.0 + 3.0 + 8.0 + 6.0 + 11.0 + 11.0 + 12.0) / 11.0;
        double actual = service.findAverage(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
}

