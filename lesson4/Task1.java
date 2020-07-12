package com.itacademy.lesson4;

public class Task1 {
    /**
     * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
     */

    public static void main(String[] args) {
        int value = 125;
        System.out.println("Сумма цифр числа " + value + " : " + sumValue(value));
    }

    public static int sumValue(int value) {
        int varValue = value;
        int result = 0;
        while (varValue != 0) {
            result += varValue % 10;
            varValue /= 10;
        }
        return result;
    }


}
