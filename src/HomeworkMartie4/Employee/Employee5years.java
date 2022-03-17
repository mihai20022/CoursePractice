package HomeworkMartie4.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee5years {
    String nameEmployee;
    int yearsOfActivity;


    public void Employee(String nameEmployee, int yearsOfActivity){
        this.nameEmployee =nameEmployee;
        this.yearsOfActivity = yearsOfActivity;

    }



    public static ArrayList<Employee5years> filterEmployee(Employee5years[] employee5years){
        ArrayList<Employee5years> list = new ArrayList<>();
        for(Employee5years employee: employee5years){
            if(employee.yearsOfActivity>= 5)
                list.add(employee);
        }
        return list;

    }

    public static void PrintEmployees(ArrayList<Employee5years> list){
        for(Employee5years employee5years: list){
            System.out.println(employee5years);
        }
    }

}
