package HomeworkLesson7.java;


import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args){
        int num,rem,reversed_Num=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number for find reverse: ");

        num=scan.nextInt();
        do{
            rem=num%10;
            reversed_Num=reversed_Num*10+rem;
            num=num/10;
        }while(num>0);

        System.out.print("Reverse of the number is: "+reversed_Num);
    }
    }

