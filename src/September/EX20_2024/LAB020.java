package September.EX20_2024;
import java.lang.Math;

public class LAB020 {
    public static void main(String[] args) {
        int age = 30;
        if (age >= 18) {
            System.out.println("ALlowed to Vote!!");
        }else{
            System.out.println("Not allowed !");
        }

        boolean b = !true;
        if (b){
            System.out.println("b is true");
        } else {
            System.out.println("b is not true");
        }

        boolean a = true;
        a = !a;
        if (2+2<4) {
            System.out.println("Inside the loop");
        }
        System.out.println("Outside ->" + a );

    }



}
