package com.itacademy.lesson4;

public class Task2 {
    /**
     * Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
     */

    public static void main(String[] args) {
        int value = 1000;
        showFibonachyNumbers(value);
    }

    public static void showFibonachyNumbers(int value) {
        System.out.print("Числа Фибоначчи меньше числа " + value + ": 0");
        int firstValue = 0;
        int secondValue = 1;
        int nextValue = 1;
        do {
            System.out.print(" " + nextValue);
            nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
        }
        while (secondValue < value);
    }
}
