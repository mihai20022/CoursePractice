package HomeworkLesson12.CalculateCharges;

import java.util.Scanner;

public class CalculateCharges {
    float charge1 = 2.00f;
    int hoursParked ;
    float finalcharge;
    float fee = 0.5f;
    int i;
    Scanner input = new Scanner(System.in);

    public void HoursParked(){
        System.out.println("Enter the hours of the client = ");
        hoursParked = input.nextInt();
    }
    public void CalculateCharges1() {
        if(hoursParked <=3){
            System.out.println("Client has to pay - " + charge1);
        }
        else{

            finalcharge = charge1 + (fee * (hoursParked- 3 ));
        }

        if (hoursParked >= 20)
            System.out.println("Client has to pay 10$ ");
        else System.out.println("Client has to pay - " + finalcharge );


    }
}
