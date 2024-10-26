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

        int num = 11;
        if (num %2 == 0) {
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }

        int num1 = 10; // 30,40
        int num2 = 30;
        if (num1>num2) {
            System.out.println(num1);
        } else if(num2>num1) {
            System.out.println(num2);
        } else {
            System.out.println("Equal!");

        }


    }



}
