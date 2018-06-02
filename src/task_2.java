/* 2.Создать программу, которая будет вычислять и выводить на экран
сумму, разность, НОК и НОД двух целых чисел, введенных пользователем.
Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
*/

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        //Input and check
        int x;
        int y;
        Scanner input= new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        if (input.hasNextInt()) {
            x = input.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            return;
        }
        System.out.println("Введите второе целое число:");
        if (input.hasNextInt()) {
            y = input.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            return;
        }

        //Mathematical operations
        System.out.println("Сумма: "+(x+y));
        System.out.println("Разность: "+(x-y));
        System.out.println("НОД: "+gcd(x, y));

        //LCM (Least Common Multiple)
        int lcm=(x*y/gcd(x, y));
        System.out.println("НОК: "+lcm);
    }

    //GCD (Greatest Common Divisor)
    private static int gcd(int a, int b) {
        while (b!=0) {
            int c=a%b;
            a=b;
            b=c;
        }
        return a;
    }
}