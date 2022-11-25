package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {
    @Test

    public void shouldCalcCountSqrOnRange() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountSqrOnLeftBoundaryRange() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calcSqr(0, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCountSqrOnRightBoundaryRange() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calcSqr(9801, 10_000);

        Assertions.assertEquals(expected, actual);
    }
}