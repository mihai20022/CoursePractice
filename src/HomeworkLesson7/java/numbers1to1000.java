package HomeworkLesson7.java;

import java.util.Scanner;

public class numbers1to1000 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter from which number you want the numbers divided by 5 and 6");
        int a = input.nextInt();
        System.out.println("Enter to which number you want the numbers divided by 5 and 6");
        int b = input.nextInt();
        int i = a;

        for (a= i; i <=b; i++ ){

            if (i % 5 == 0 && i % 6 == 0 ){
                System.out.print(i +" ");

            }
        }
    }
}
