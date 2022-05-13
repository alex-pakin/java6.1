package ru.netology.stats;

public class StatsService {
    public int sumSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum1 = 0;
        int result = 0;
        for (int sale : sales) {
            result = sum1 += sale;
        }
        return result / sales.length;
    }

    public int maxSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthBelowAverage = 0;
        int month = 0;
        int average = 15;
        for (int sale : sales) {
            if (sale < average) {
                monthBelowAverage++;
            }
            month = month + 1;
        }
        return monthBelowAverage;
    }

    public int aboveAverage() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthAboveAverage = 0;
        int month = 0;
        int average = 15;
        for (int sale : sales) {
            if (sale > average) {
                monthAboveAverage++;
            }
            month = month + 1;
        }
        return monthAboveAverage;
    }
}
