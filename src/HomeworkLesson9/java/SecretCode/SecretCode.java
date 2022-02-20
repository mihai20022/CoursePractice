package HomeworkLesson9.java.SecretCode;

import java.util.Scanner;

public class SecretCode {
    Scanner input = new Scanner(System.in);
    String word;
    int j= 0;


    public void verifyPassword(){
        do {
            word = input.nextLine();
            if(word.contains("1234")){
                System.out.println("Correct, welcome back."); break;}
            else if(j< 2){
                System.out.println("Incorrect, try again.");j++;}
            else {System.out.println("Sorry but you have been locked out");break;}


        } while (j<= 2);

    }
}

