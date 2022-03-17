package HomeworkMartie2.Reverse;

import java.util.Scanner;

public class Reverse1 {
    Scanner input = new Scanner(System.in);
    String str;


    public void InputString(){
        System.out.println("Enter the string");
        str = input.nextLine();
    }
    public void ToChar(){
        char[] chars = str.toCharArray();
        for(int i=0; i< chars.length;i++){
            chars[i]=str.charAt(i);
        }


        System.out.println("Reversed String: \n");
        for(int i = chars.length-1; i >= 0; i--){

            System.out.print(chars[i]);
        }
    }
}
