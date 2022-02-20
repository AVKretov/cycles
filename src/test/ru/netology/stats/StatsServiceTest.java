package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumOfArray() {
        StatsService service =  new StatsService();
        long sales[] = {2, 3, 5, 7, 3, 4, 6, 10, 15};
        long expected = 55;


        long actual = service.sumOfArray(sales);


        assertEquals(expected, actual);
    }

    @Test
    void averageAmmount() {
        StatsService service = new StatsService();
        long sales[] = {2, 3, 5, 7, 3, 4, 4};
        long expected = 4;


        long actual = service.averageAmmount(sales);


        assertEquals(expected, actual);

    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        long sales[] = {2, 3, 5, 7, 3, 4};
        int expected = 4;

        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void minSales() {StatsService service = new StatsService();
        long sales[] = {2, 3, 5, 7, 3, 4};
        int expected =1;

        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void lowerThanAverageAmmount() {StatsService service = new StatsService();
        long sales[] = {2, 3, 5, 7, 3, 4};
        int expected =3;

        int actual = service.lowerThanAverageAmmount(sales);

        assertEquals(expected, actual);
    }

    @Test
    void higherThanAverageAmmount() {StatsService service = new StatsService();
        long sales[] = {2, 3, 5, 7, 3, 4};
        int expected =2;

        int actual = service.higherThanAverageAmmount(sales);

        assertEquals(expected, actual);
    }
}