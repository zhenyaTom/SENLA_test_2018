/* 8. Написать программу, которая в последовательности от 0 до N,
находит все числа-палиндромы (зеркальное значение равно оригинальному).
Длина последовательности вводится вручную и не должна превышать 100.
 */

import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
        //Input and check
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину последовательности от 0 до ... (Максимальное значение равно 100):");
        if (input.hasNextInt()) {
            N = input.nextInt()+1;
            if (N > 101) {
                System.out.println("Вы указали длину последовательности больше 100.");
                return;
            }
            if (N <= 0) {
                System.out.println("Значение должно быть положительным");
                return;
            }
        } else {
            System.out.println("Вы некорректно ввели длину последовательности.");
            return;
        }

        //Creating an array
        int arr[] = new int[N];
        int j = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = j;
            j++;
        }

        //Check and output results
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString())) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("В последовательности от 0 до "+(N-1)+" количество чисел-палиндромов составляет: "+count);
    }
}