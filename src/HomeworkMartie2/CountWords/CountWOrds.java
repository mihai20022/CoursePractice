package HomeworkMartie2.CountWords;

import java.util.Scanner;

public class CountWOrds {
    Scanner input = new Scanner(System.in);
    String str1;
    int count = 0;


    public void InputString(){
        System.out.println("Enter the string");
        str1 = input.nextLine();

    }

    public void CountWords(){
        String[] words = str1.split(" ");
        for (String word : words){
            count++;
        }
        System.out.println(count);
    }

}
