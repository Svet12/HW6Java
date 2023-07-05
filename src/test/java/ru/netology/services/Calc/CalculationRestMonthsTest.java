package ru.netology.services.Calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.CalculationRestMonths;

public class CalculationRestMonthsTest {

    @Test
    void testMethodOfCalculatingMonthsOfRest() {
        CalculationRestMonths service = new CalculationRestMonths();

        int expected = 3;

        int income = 10_000; //доход
        int expenses = 3_000; //расходы
        int threshold = 20_000; //порог
        int rest = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++)
            if (money >= threshold) { // можем ли отдыхать?
                rest++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }


        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void test2MethodOfCalculatingMonthsOfRest() {
        CalculationRestMonths service = new CalculationRestMonths();

        int expected = 2;

        int income = 100_000; //доход
        int expenses = 60_000; //расходы
        int threshold = 150_000; //порог
        int rest = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++)
            if (money >= threshold) { // можем ли отдыхать?
                rest++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }


        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}



