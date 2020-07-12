package com.itacademy.lesson4;

import java.util.Random;

public class Task3 {
    /**
     * Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
     * Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
     * Программа должна выводить:
     * a. Количество дней
     * b. Сумму осадков за этот период
     * c. Среднее количество осадков за этот период
     * d. Максимальное количество дневных осадков за этот период
     * Не использовать массивы!
     */

    public static void main(String[] args) {
        int numberOfDays = 20;
        calculateRainStatistics(numberOfDays);
    }

    public static void calculateRainStatistics(int value) {
        System.out.println("Статстика по осадкам за " + value + " дней (в сантиметрах):");
        Random rainValue = new Random();
        int sumRainValue = 0;
        int maxRainValue = 0;
        for (int i = 0; i < value; i++) {
            int randomRainValue = rainValue.nextInt(100);
            System.out.print(randomRainValue + " ");
            sumRainValue += randomRainValue;
            if (maxRainValue < randomRainValue)
                maxRainValue = randomRainValue;
        }
        double averageRainValue = sumRainValue / value;
        System.out.println();
        System.out.println("Сумма осадков: " + sumRainValue);
        System.out.println("Среднее количество осадков: " + averageRainValue);
        System.out.println("Максимальное значение осадков за день: " + maxRainValue);
    }
}
