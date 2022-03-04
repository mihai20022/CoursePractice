package HomeworkLesson12.Primenumbers;

import java.util.Scanner;

public class PrimeFinder {
    Scanner input = new Scanner(System.in);
    int primeNumber;
    int i;
    boolean flag = true;



    public void InputPrime(){
        System.out.println("Enter number in order to verify if it is a prime");
        primeNumber = input.nextInt();

    }
    public void VerifyPrime(){
        for (i =2; i <=primeNumber/2; ++i){
            if(primeNumber % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println(" Prime Number");
        else System.out.println("Not prime number");




    }
}
