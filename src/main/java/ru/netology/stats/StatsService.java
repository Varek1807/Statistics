package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long salesAmount(long[] sales) {
        long amount = 0;

        for (long sale : sales) {
            amount = amount + sale;
        }
        return amount;
    }

    public long averageSalesAmount(long[] sales) {
        long amount = 0;
        int numberMonths = 0;
        long averageAmount;
        for (long sale : sales) {
            amount = amount + sale;
            numberMonths = numberMonths + 1;
        }
        averageAmount = amount / numberMonths;
        return averageAmount;
    }

    public long monthsAboveAverage(long[] sales) {
        int months = 0;
        long averageSales = averageSalesAmount(sales);
        for (long sale : sales) {
            if (averageSales < sale) {
                months = months + 1;
            }
        }
        return months;
    }

    public long monthsBelowAverage(long[] sales) {
        int months = 0;
        long averageSales = averageSalesAmount(sales);
        for (long sale : sales) {
            if (averageSales > sale) {
                months = months + 1;
            }
        }
        return months;
    }
}
