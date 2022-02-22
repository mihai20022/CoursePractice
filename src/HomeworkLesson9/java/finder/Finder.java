package HomeworkLesson9.java.finder;

import java.util.Scanner;

public class Finder {
    Scanner input = new Scanner(System.in);
    String word;
    char character1;
    int j = 0;
    int i;
    String[] StringArray = new String[100];

    public void word1(){
        word =input.nextLine();
        System.out.println("The word is:  " + word);
        for(i= 0; i< word.length();i++){
            StringArray[i] = word;
        }

    }
  /*public void findcharacters(){
        character1 = input.nextLine();
        for(i =0; i <this.word.length();i++) {
            if(word.charAt(i)== character1)) {
                j ++;
            } else break;
        } System.out.println("Letter " + character1 + "  is contained  -   " + j);
    }*/
}

