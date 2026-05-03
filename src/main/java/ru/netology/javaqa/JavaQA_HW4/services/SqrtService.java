package ru.netology.javaqa.JavaQA_HW4.services;

public class SqrtService {
    public int calcSqrt(int x) {
        for (int i = 1; i <= x; i++) {
            if (i * i >= x) {
                return i;
            }
        }
        return -1;
    }
}