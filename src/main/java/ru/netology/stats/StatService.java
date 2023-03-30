package ru.netology.stats;

public class StatService {

    public long sum(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long average(long[] sales) {
        long averageSales = 0;
        long sumSales = sum(sales);
        averageSales = (sumSales / sales.length);
        return averageSales;
    }

    public int monthMaxSale(long[] sales) {
        int maxMonth = 0;
        long saleMaximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                maxMonth = i;
                saleMaximum = sales[i];
            }
        }
        return maxMonth + 1;
    }

    public int monthMinSale(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int counter = 0;

        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
