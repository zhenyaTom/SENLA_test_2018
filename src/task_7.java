/* 7. Написать программу, которая рандомно генерирует массив
2-ух значных чисел длины N (вводится вручную)
и выводит наименьшее и наибольшее число из списка.
 */

import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        //Input and check
        int N;
        Scanner input= new Scanner(System.in);
        System.out.println("Введите длину рандомно генерируемого массива:");
        if (input.hasNextInt()) {
            N = input.nextInt();
            if (N <= 0) {
                System.out.println("Вы некорректно ввели длину массива!");
                return;
            }
        } else {
            System.out.println("Вы некорректно ввели длину массива!");
            return;
        }

        //Random array generation
        int arr[]=new int[N];
        for (int i=0; i<N; i++) {
            arr[i]=10+(int)(Math.random()*90);
        }

        //Search MAX and MIN
        int max=arr[0];
        for (int i=0; i<arr.length; i++) {
            if (max<arr[i])
                max=arr[i];
        }
        System.out.println("Максимальное значение: "+max);

        int min=arr[0];
        for (int i=0; i<arr.length; i++) {
            if (min>arr[i])
                min=arr[i];
        }
        System.out.println("Минимальное значение: "+min);
    }
}