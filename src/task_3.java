/* 3. Необходимо написать программу, которая проверяет слово на "палиндромность".
Слово для проверки вводится вручную во время выполнения программы.
 */

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        //Input
        Scanner input=new Scanner(System.in);
        System.out.println("Введите слово:");
        String s=input.next();

        //Word inversion
        String s2="";
        for (int i=s.length()-1; i>=0; --i) {
            s2 += s.charAt(i);
        }

        //Comparison of words and output results
        if (s.equalsIgnoreCase(s2)) {
            System.out.println("Слово "+'"'+s+'"'+" палиндром");
        } else System.out.println("Слово "+'"'+s+'"'+" не палиндром");
    }
}