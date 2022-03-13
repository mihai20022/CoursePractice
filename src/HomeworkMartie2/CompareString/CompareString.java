package HomeworkMartie2.CompareString;

import java.util.Locale;
import java.util.Scanner;

public class CompareString {
    Scanner input = new Scanner(System.in);
    String string1;
    String string2;


    public void InputString(){
        string1 = input.next();
        string2 = input.next();
    }

    public void CompareString1(){
        String str1 = string1.toLowerCase();
        String str2 = string2.toLowerCase();
        if(str1.equals(str2)) System.out.println("Ignoring the case sensitive, they are the same");
        else System.out.println("Ignoring the case sensitive, they are not the same");


    }
}
