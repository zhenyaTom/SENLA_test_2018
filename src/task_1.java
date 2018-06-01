/* 1.Создать программу, которая будет сообщать, является ли целое число,
введенное пользователем, чётным или нечётным, простым или составным.
Если пользователь введёт не целое число, то сообщать ему об ошибке.
*/

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        //Input and check
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число:");
        if (input.hasNextInt()) {
            x = input.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            return;
        }

        //Even or not even number
        if (x%2==0) {
            System.out.println("Число " + x + " четное");
        } else System.out.println("Число "+x+" нечетное");

        //Prime or compound number
        //Special cases
        if (x<0) {
            int y=x*-1;
            int i;
            boolean prime = true;
            for (i = 2; i < y; i++) {
                if (x % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("Число "+x+" отрицательное и по определению не может быть простым или составным, но число "+y+" простое");
            } else {
                System.out.println("Число "+x+" отрицательное и по определению не может быть простым или составным, но число "+y+" составное");
            }
        } else if (x==0 || x==1) {
            System.out.println("Число "+x+" по определению ни простое ни составное");
        } else {

            //Ordinary cases
            int i;
            boolean prime = true;
            for (i = 2; i < x; i++) {
                if (x % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("Число " + x + " простое");
            } else {
                System.out.println("Число " + x + " составное");
            }
        }
    }
}