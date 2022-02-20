package HomeworkLesson8.java;

import java.util.Scanner;

public class maximumAndMinimum {
    public static void main(String[] args) {
        int n, i,j , min = 0, max = 0, tip=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to have: ");
        n = input.nextInt();
        int[] Array3 = new int[10];
        System.out.println("Enter the elements of the array");
        for (i=0; i < n; i++){
            Array3[i] = input.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (i = 0; i< n; i++){
            System.out.print(Array3[i]);
            System.out.print(" ");
        }

        for (i = 0; i<n;i++){
            if(Array3[i] > max){
                max = Array3[i];

            }



        }
        System.out.println("\n Maximum number is " +max);
        for ( i = 0; i < n; i++)
        {
            for ( j = i + 1; j < n; j++)
            {
                if (Array3[i] > Array3[j])
                {
                    tip = Array3[i];
                    Array3[i] = Array3[j];
                    Array3[j] = tip;
                }
            }
        }
        System.out.println("Minimum number is "+ Array3[0]);

    }
}
