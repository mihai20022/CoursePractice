package HomeworkLesson9.java.Employee;

import java.util.Scanner;

public class Employee {


      String name;
      int yearOfJoining;
      String address;

      Employee(String name, int yearOfJoining, String address){
          this.name = name;
          this.yearOfJoining = yearOfJoining;
          this.address = address;
    }

    void show(){
        System.out.println("Employee name: "+ name + "\nYear of Joining: " + yearOfJoining + "\nAddress:" +address);
    }
    }



