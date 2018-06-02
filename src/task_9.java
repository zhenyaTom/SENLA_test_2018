/* 9. Написать программу выводящую на экран все четные числа и их сумму
из последовательности от 0 до N. N вводится вручную.
 */

import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        //Input and check
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину последовательности от 0 до ... :");
        if (input.hasNextInt()) {
            N = input.nextInt();
            if (N < 0) {
                System.out.println("Значение должно быть положительным");
                return;
            }
        } else {
            System.out.println("Вы некорректно ввели длину последовательности.");
            return;
        }

        //Find the size of an array of even numbers
        int s=0;
        for (int i=0; i<=N; i++) {
            if (i%2 == 0) s++;
        }

        //Create an array of even numbers
        int evenNumbers [] = new int[s];
        int j=0;
        for (int i=0; i<=N; i++) {
            if (i%2 == 0) {
            evenNumbers[j]=i;
            j++;
            }
        }

        //Output results
        System.out.println("В последовательности от 0 до "+N+" следующие четные числа:");
        int sum=0;
        for (int i=0; i<evenNumbers.length; i++) {
            System.out.println(evenNumbers[i]);
            sum+=evenNumbers[i];
        }
        System.out.println("Сумма четных чисел в последовательности от 0 до "+N+" равна: "+sum);
    }
}