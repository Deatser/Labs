package ru.mirea.lab1;

public class Example {
    public static void main(String[] args) {
    // Задача 1: инициализация массива, сумма и среднее арифметическое
    int[] arr = {1, 2, 3, 4, 5};
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    double average = (double) sum / arr.length;
    System.out.println("Сумма элементов: " + sum);
    System.out.println("Среднее арифметическое: " + average);


    }
}
