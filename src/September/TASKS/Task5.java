package September.TASKS;

import java.awt.print.Printable;

public class Task5 {
    public static void main(String[] args) {
//         Ternary operator to multiple condition
        int score = 85;
//        String = "A,B,C";
        String S = 85 >= 90? "A": 85 >= 80 ? "B": 85>= 70? "C": "D";
        System.out.println(S); //B

        int sc = 90;
        String Sc = 85 <= 90? "A": 85 <= 80 ? "B": 85<= 70? "C": "D";
        System.out.println(Sc); // A

        int a = 12;
        String a1 = a >= 90 ? "A" : a >= 80 ? "B" : a >= 70 ? "C" : "D";
        System.out.println(a1); // D


        int q = 45;
        String q1 = q >= 75? "A": q >= 50 ? "B": q >= 35 ? "C": "D";
        System.out.println(q1); // // C

//        int w = 85;
//        String w1 = 85 <= 90? "A": 85 <= 80 ? "B": 85<= 70? "C": "D";
//        System.out.println(w1); //




    }
}
