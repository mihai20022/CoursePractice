package HomeworkLesson9.java.Area;

import java.util.Scanner;

public class Area {
    int width;
    int length;

    public Scanner input = new Scanner(System.in);


     public void setDim() {
        System.out.println("Enter the length");
        length = input.nextInt();
        System.out.println("Enter the width");
        width = input.nextInt();
    }
    public void getDim(int width, int length){
         int area3 = width * length;
        System.out.println("Area is " + area3);
    }




    }



