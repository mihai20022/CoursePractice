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
        for (int i =0; i< words.length-2;i++) {
            System.out.print(words[i].charAt(0));
            System.out.print(".");
        }
        }


    }





