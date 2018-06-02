/* 10. Написать программу, составляющую всевозможные комбинации
3-х значных чисел из 3-х введенных пользователем цифр.
Цифры вводятся вручную.
*/

import java.util.*;

public class task_10 {
    public static void main(String[] args) {
        //Input and check
        int a, b, c;
        Scanner input = new Scanner(System.in);

        //a
        System.out.println("Введите первую цифру от 0 до 9:");
        if (input.hasNextInt()) {
            a = input.nextInt();
            if (a < 0 || a>9) {
                System.out.println("Значение должно быть от 0 до 9");
                return;
            }
        } else {
            System.out.println("Вы некорректно ввели длину последовательности.");
            return;
        }

        //b
        System.out.println("Введите вторую цифру от 0 до 9:");
        if (input.hasNextInt()) {
            b = input.nextInt();
            if (b < 0 || b>9) {
                System.out.println("Значение должно быть от 0 до 9");
                return;
            }
        } else {
            System.out.println("Вы некорректно ввели длину последовательности.");
            return;
        }

        //c
        System.out.println("Введите третью цифру от 0 до 9:");
        if (input.hasNextInt()) {
            c = input.nextInt();
            if (c < 0 || c>9) {
                System.out.println("Значение должно быть от 0 до 9");
                return;
            }
        } else {
            System.out.println("Вы некорректно ввели длину последовательности.");
            return;
        }
        if (a==0 && b==0 && c==0) {
            System.out.println("Из 3-х нулей невозможно составить 3-х значное число!");
            return;
        }

        //Creating an array
        int arr[]=new int [6];
        arr[0] = comb(a, b, c);
        arr[1] = comb(a, c, b);
        arr[2] = comb(b, a, c);
        arr[3] = comb(b, c, a);
        arr[4] = comb(c, a, b);
        arr[5] = comb(c, b, a);

        //Removing duplicate and two-digit numbers + sorting
        TreeSet<Integer> num3 = new TreeSet<>();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] >= 100) {
                num3.add(arr[i]);
            }
        }

        //Output results
        System.out.println("Из указанных Вами цифр можно составить следующие комбинации 3-х значных чисел:");
        System.out.println(num3);
    }

    //Class for Combining digits into numbers
    private static int comb (int a, int b, int c) {
        return (a*100+b*10+c);
    }
}