/* 5. Создать программу, которая подсчитывает
сколько раз употребляется слово в тексте (без учета регистра).
Текст и слово вводится вручную.
 */

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        //Input
        Scanner input=new Scanner(System.in);
        System.out.println("Введите текст:");
        String text=input.nextLine();
        System.out.println("Введите искомое слово:");
        String searchword=input.nextLine();

        //Remove all delimiters
        text = text.replaceAll("[^а-яА-Я a-zA-Z]", "");

        //Creating an array
        String words [];
        words=text.split ("[\\s]+");

        //Check
        int result=0;
        for (int i=0; i<words.length; i++) {
            int check=words[i].compareToIgnoreCase(searchword);
            if (check == 0) {
                result +=1;
            }
        }

        //Output results
            /* P.S. This is my first program after "Hello world", counted the rubles!
               Who would have thought that it would be useful... =) */
        if (result == 0)
            System.out.println("В тексте слово "+'"'+searchword+'"'+" не употребляется.");
        else if (result == 1 || result%10==1 && result%100!=11)
            System.out.println("В тексте слово "+'"'+searchword+'"'+" употребляется "+result+" раз.");
        else if (result==2 || result%10==2 && result%100!=12)
            System.out.println("В тексте слово "+'"'+searchword+'"'+" употребляется "+result+" раза.");
        else if (result==3 || result%10==3 && result%100!=13)
            System.out.println("В тексте слово "+'"'+searchword+'"'+" употребляется "+result+" раза.");
        else if (result==4 || result%10==4 && result%100!=14)
            System.out.println("В тексте слово "+'"'+searchword+'"'+" употребляется "+result+" раза.");
        else
            System.out.println("В тексте слово "+'"'+searchword+'"'+" употребляется "+result+" раз.");
    }
}