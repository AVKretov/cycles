package ru.netology.stats;

public class StatsService {

    public long sumOfArray(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public long averageAmmount(long[] sales) {
        long sum = sumOfArray(sales);
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

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

    public int lowerThanAverageAmmount(long[] sales) {
        int month = 0;
        long averAm = averageAmmount(sales);
        for (long sale : sales) {
            if (sale < averAm) {
                month++;
            }
        }
        return month;
    }

    public int higherThanAverageAmmount(long[] sales) {
        int month = 0;
        long averAm = averageAmmount(sales);
        for (long sale : sales) {
            if (sale > averAm) {
                month++;
            }
        }
        return month;

    }
}
