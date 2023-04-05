package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;

        }
        return totalSale;
    }


    public long average(long[] sales) {
        return sum(sales) / sales.length;

    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                monthMax = i;
                maxSale = sales[i];


            }

        }
        return monthMax + 1;
    }


    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                monthMin = i;
                minSale = sales[i];


            }

        }
        return monthMin + 1;
    }

    public int saleBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int saleAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
