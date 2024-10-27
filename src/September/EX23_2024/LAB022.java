package September.EX23_2024;

import java.util.Optional;

public class LAB022 {
    public static void main(String[] args) {
/* if condition
        if ELSE | if else if, else /
 Switch / For Loop / While loop / DO while loop / Take user input
 */
//        SWITCH - multi-way branch statement
//        Syntax - switch (expression){ case 1 break } - break is important to be used
//        Days - 1 to 7 , 1 = monday
        int day = 5;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedneday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea, whats the dat today !");
                break;

        }
        System.out.println("End of teh loop");


    }

}
