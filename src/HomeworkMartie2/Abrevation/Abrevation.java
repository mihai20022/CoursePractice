package HomeworkMartie2.Abrevation;

import java.util.Arrays;
import java.util.Scanner;

public class Abrevation {
    Scanner input = new Scanner(System.in);
    String string;


    public void InputString(){
        System.out.println("Enter the string");
        string = input.nextLine();

    }

    public void SeparateString(){
        String[] words = string.split(" ");
        for (String word : words) {
            System.out.print(word.substring(0, 1));
            System.out.print(".");
            // nu inteleg cum sa pun primul cuvant sa fie abreviat. :(


        }


    }




}
