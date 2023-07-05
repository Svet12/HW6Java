package ru.netology.services.Calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.CalculationRestMonths;

public class CalculationRestMonthsTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/datacalc.csv")
    void testMethodOfCalculatingMonthsOfRest(int expected, int income, int expenses, int threshold) {
        CalculationRestMonths service = new CalculationRestMonths();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }

}




