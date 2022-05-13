package ru.netology.stats;

public class StatsService {
    public int sumSales(int [] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSum(int [] sales) {
        int sum1 = 0;
        int result = 0;
        for (int sale : sales) {
            result = sum1 += sale;
        }
        return result / sales.length;
    }

    public int maxSales(int [] sales) {
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

    public int minSales(int [] sales) {
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

    public int belowAverage(int [] sales) {
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

    public int aboveAverage(int [] sales) {
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
