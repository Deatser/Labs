package ru.mirea.lab1;
import java.util.Scanner;

public class Example {
    public static int Factorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
    // Задача 1: Сумма и среднее арифметическое элементов целочисленного массива
    int[] mas = {1, 2, 3, 4, 5};
    int sum = 0;
    for (int ma : mas) {
        sum += ma;
    }
    double average = (double) sum / mas.length;
    System.out.println("Сумма элементов: " + sum);
    System.out.println("Среднее арифметическое: " + average);

    // Задача 2: ввод значений целочисленного массива, нахождение суммы, минимального и максимального значений
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите размер массива: ");
    int size = sc.nextInt();
    int[] userMas = new int[size];
    int userSum = 0;
    int userMax = Integer.MIN_VALUE;
    int userMin = Integer.MAX_VALUE;
    int i = 0;
    System.out.print("Введите элементы массива: \n");
    do {
        int elem = sc.nextInt();
        userMas[i] = elem;
        userSum += elem;
        if (elem > userMax) {
            userMax = elem;
        }
        if (elem < userMin) {
            userMin = elem;
        }
        i++;
    } while (i < size);
    System.out.println("Сумма элементов: " + userSum);
    System.out.println("Максимальное значение: " + userMax);
    System.out.println("Минимальное значение: " + userMin);

    // Задача 3: Вывод на экран аргументов командной строки в цикле for
    System.out.println("Aргументы командной строки: " + args.length);
    for (String arg : args) {
        System.out.println(arg);

    }
    // Задача 4: Вывод первых 10 чисел гармонического ряда
    System.out.println("Первые 10 чисел гармонического ряда: ");
    for (i = 1; i <= 10; i++) {
        System.out.printf("1/%d = %.3f%n", i, 1.0 / i);
    }

    // Задача 5: Вычисление факториала с помощью метода класса
    System.out.println("Введите число для вычисления факториала: ");
    int number = sc.nextInt();
    System.out.println(Factorial(number));
    }
}
