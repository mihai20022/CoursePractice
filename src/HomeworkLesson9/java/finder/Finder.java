package HomeworkLesson9.java.finder;

import java.util.Scanner;

public class Finder {
    Scanner input = new Scanner(System.in);
    String word;
    String character1;
    int j = 0;

    public void word1(){
        word =input.nextLine();
        System.out.println("The word is:  " + word);
    }
    public void findcharacters(){
        character1 = input.next();
        for(int i =0; i <this.word.length();i++) {
            if (word.contains(this.character1)) {
                j ++;
            } else break;
        } System.out.println("Letter " + character1 + "  is contained  -   " + j);
    }
}

