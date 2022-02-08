package HomeworkLesson6.java;
import java.util.Scanner;

public class Color {
    public static void main(String[] args){

        do{

        Scanner code = new Scanner(System.in);
        System.out.println("Select and type the Color Code to get the color: \n Examples: 100; 101; 102;");
        int  colorCode = code.nextInt();
        String color ;

          color = (colorCode == 100)? getSpec1Disc():
                            (colorCode == 101 )?getSpec2Disc():
                                    (colorCode == 102 )?getSpec3Disc():
                                            
                     getSpec4Disc();







        System.out.println(color);
            System.out.println("You want to try again. Press\n 1 for stop\n 2 for continue");
            String stop = code.next();
            if (stop.equals("1")) {
                break;

            } else
                System.out.println("You want to try again. Enter color code");
            continue;

        }while (true);

    }


    static String  getSpec1Disc(){
        return "Yellow";
    }
    static String getSpec2Disc(){
        return"Green";

    }
    static String getSpec3Disc(){
        return"Red";

    }
    static String getSpec4Disc(){
        return"Invalid";

    }


}
