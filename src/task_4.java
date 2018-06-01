/* 4. Создать программу, которая будет подсчитывать количество слов в предложении
 и выводить их в отсортированном виде. Предложение вводится вручную.
 (Разделители пробел (“ ”) и запятая (“,”)).
  */

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        //Input
        Scanner input=new Scanner(System.in);
        System.out.println("Введите предложение:");
        String sent=input.nextLine();

        //Creating an array and sorting
        String words [];
        words=sent.split ("[\\s,]+");
        for (int i=words.length-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                int r=words[j].compareToIgnoreCase(words[j+1]);
                if (r > 0) {
                    String tmp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=tmp;
                }
            }
        }

        //Output results
        System.out.println("Количество слов: "+words.length);
        System.out.println("Слова предложения в алфовитном порядке:");
        for (int i=0; i<words.length; i++) {
            System.out.println(words[i]);
        }
    }
}