package HomeworkLesson5.java;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width for the I Rectangle");
        long width1 = input.nextLong();

        System.out.println("Enter the length for the I Rectangle");
        long length1 = input.nextLong();


        System.out.println("Enter the width for the II Rectangle");
        long width2 = input.nextLong();

        System.out.println("Enter the length for the II Rectangle");
        long length2 = input.nextLong();

        long AreaRectangle1 = width1 * length1;
        long AreaRectangle2 = width2 * length2;


        if (AreaRectangle1 > AreaRectangle2)
            System.out.println("Area of the I rectangle has a greater area than the II Rectangle\n"+ AreaRectangle1 + " > " + AreaRectangle2 );
        else if (AreaRectangle1 < AreaRectangle2)
            System.out.println("Area of the II rectangle has a greater area than the I Rectangle\n"+ AreaRectangle1 + " < " + AreaRectangle2 );
        else if (AreaRectangle1 == AreaRectangle2)
            System.out.println("Area of the I rectangle has the same area as the II Rectangle\n"+ AreaRectangle1 + " = " + AreaRectangle2 );


            input.close();
            



    }
}