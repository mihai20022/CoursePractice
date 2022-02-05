package HomeworkLesson6.java;

public class Color {
    public  void Ternary(){
        int colorCode = 101;
         colorCode = (colorCode == 101)? getSpecDisc(): getRegDisc();
        System.out.println(colorCode);
    }


    int  getSpecDisc(){
        System.out.println("red");
        return 0;
    }
    int getRegDisc(){
        System.out.println("yellow");
        return 0;
    }

}
