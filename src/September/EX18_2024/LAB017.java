package September.EX18_2024;

public class LAB017 {
    public static void main(String[] args) {
//        Type casting
//        Widening - Implicit, Explicit - lossless
//        Narrowing - Implicit, Explicit (with data type loss

//        Widening
        byte b = 10;
        int a = b; // valid - Implicit
        int a1 = (int)b; // Explicit

//        Narrowing
        int val = 300;
       // byte b1 = val; // Invalid Implicit casting
        byte b2 = (byte)val; // Invalid Explicit casting - Leads to data loss
        System.out.println(b2);

        long phone_no = 987654321;
        // short s= phone_no; // Invalid Implicit casting
        short s1 = (short)phone_no;
        System.out.println(s1);

//        Narrowing with Explicit will lead to loss of data;
        int course = 100;
        float GST = 18.45f;
        int total_price = course+ (int) GST; // narrowing - Explicit - loss
        float tp = course+GST;
        System.out.println(tp);
        System.out.println(total_price);




    }
}
