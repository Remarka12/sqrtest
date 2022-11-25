package ru.netology.sqr;

public class SQRService {
    int firstBoundary;
    int secondBoundary;

    public int calcSqr(int firstBoundary, int secondBoundary) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= firstBoundary && sqr <= secondBoundary) {
                counter++;
            }
        }
        return counter;
    }
}

