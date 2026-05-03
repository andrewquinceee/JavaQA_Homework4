package ru.netology.javaqa.JavaQA_HW4.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    // Порядок параметров должен точно совпадать с колонками в CSV
    public void testCalculate(long expected, long amount, boolean registered) {
        BonusService service = new BonusService();

        // Метод называется calculate и возвращает long
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}
//    @Test
//    void shouldCalculateForRegisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1000;
//        boolean registered = true;
//        long expected = 30;
//
//        long actual = service.calculate(amount, registered);
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    void shouldCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1_000_000;
//        boolean registered = true;
//        long expected = 500;
//
//        long actual = service.calculate(amount, registered);
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    void shouldCalculateForUnregisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 1000;
//        boolean registered = false;
//        long expected = 10;
//
//        long actual = service.calculate(amount, registered);
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    void shouldCalculateForUnregisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        long amount = 10_000_000;
//        boolean registered = false;
//        long expected = 500;
//
//        long actual = service.calculate(amount, registered);
//
//        Assertions.assertEquals(expected, actual);
//    }
//}