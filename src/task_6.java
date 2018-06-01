/* 6. Написать программу, которая проверяет три отрезка
на возможность создать прямоугольный треугольник.
Длина отрезков вводится вручную.
 */

import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        double l1;
        double l2;
        double l3;

        //Input
        Scanner input= new Scanner(System.in);
        System.out.println("Введите длину 1-го отрезка:");
        if (input.hasNextDouble()) {
            l1 = input.nextDouble();
        } else {
            System.out.println("Вы ввели не число");
            return;
        }

        System.out.println("Введите длину 2-го отрезка:");
        if (input.hasNextDouble()) {
            l2 = input.nextDouble();
        } else {
            System.out.println("Вы ввели не число");
            return;
        }

        System.out.println("Введите длину 3-го отрезка:");
        if (input.hasNextDouble()) {
            l3 = input.nextDouble();
        } else {
            System.out.println("Вы ввели не число");
            return;
        }

        //Check and output results
        if (l1 > l2 && l1 > l3) {
            if (Math.pow(l1, 2) == (Math.pow(l2, 2)+Math.pow(l3, 2))) {
                System.out.println("Из указанных отрезков можно построить прямоугольный треугольник.");
            } else System.out.println("Из указанных отрезков невозможно построить прямоугольный треугольник.");
        }

        if (l2 > l1 && l2 > l3) {
            if (Math.pow(l2, 2) == (Math.pow(l1, 2)+Math.pow(l3, 2))) {
                System.out.println("Из указанных отрезков можно построить прямоугольный треугольник.");
            } else System.out.println("Из указанных отрезков невозможно построить прямоугольный треугольник.");
        }

        if (l3 > l1 && l3 > l2) {
            if (Math.pow(l3, 2) == (Math.pow(l1, 2)+Math.pow(l2, 2))) {
                System.out.println("Из указанных отрезков можно построить прямоугольный треугольник.");
            } else System.out.println("Из указанных отрезков невозможно построить прямоугольный треугольник.");
        }
    }
}