package HomeworkLesson8.java;

import java.lang.reflect.Array;
import java.util.Scanner;

public class oddEvenArrays {
    public static void main(String[] args) {
        int n, i,j, sum= 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many number you want to have ");
        n = input.nextInt();
        int[] oddEvenArray = new int[10];
        System.out.print("Enter the numbers of the one dimensional array:  ");
        for(i=0; i< n; i++){
            oddEvenArray[i]= input.nextInt();
        }
        System.out.println("The numbers of the one dimensional array: ");
        for (i=0; i< n; i++ ){
            System.out.print(oddEvenArray[i]);
            System.out.print(" ");
        }

        System.out.println("\nThe even numbers are: ");
        for(i=0; i< n;i++){
        if(oddEvenArray[i]% 2 == 0)
            System.out.print(oddEvenArray[i]);
            System.out.print(" ");
            for(j=0; j< i; j++ ) {
                sum = sum + oddEvenArray[j];
                System.out.println(sum);
            }
        }

        System.out.println("\nThe odd numbers are: ");
            for(i=0; i< n;i++){
                if(oddEvenArray[i]% 3 == 0)
                    System.out.print(oddEvenArray[i]);
                    System.out.print(" ");
            }
}
}
