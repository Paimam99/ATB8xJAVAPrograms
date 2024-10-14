package September.TASKS;

public class Task4 {
    public static void main(String[] args) {
//       Implicit & Explicit
        byte a = 10;
        float f= 123.34f;
        int b = a+(byte)f;
       // int c = a+f;
        System.out.println(b); //133
        // System.out.println(c);

//        Increment & Decremental operators
        int d = 10;
        System.out.println(--d+ d--+d); //26
        System.out.println(d); //8

        System.out.println(--d + d++ + d--); // 28
        System.out.println(d); //9

        System.out.println(d-- + d-- + d--); //27
        System.out.println(d); //7
    }
}
