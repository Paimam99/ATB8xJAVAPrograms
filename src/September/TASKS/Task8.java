package September.TASKS;

import java.lang.runtime.SwitchBootstraps;

public class Task8 {
    public static void main(String[] args) {
//         User will take the integer input 1 -12 , month from Jan - dec using th switch function
        int month = 12;
        switch(month){
            case 1-> System.out.println("January");
            case 2-> System.out.println("February");
            case 3-> System.out.println("March");
            case 4-> System.out.println("April");
            case 5-> System.out.println("May");
            case 6-> System.out.println("June");
            case 7-> System.out.println("July");
            case 8-> System.out.println("August");
            case 9-> System.out.println("September");
            case 10-> System.out.println("October");
            case 11-> System.out.println("November");
            case 12-> System.out.println("December");
            default-> System.out.println("Enter valid month name");


        }


    }
}
