package September.EX18_2024;

public class LAB018 {
    public static void main(String[] args) {
//        Incremental & Decremental
        int a = 10;
        System.out.println(a++); //10 | Post-increment
        System.out.println(a++ +a ); // 23

        int b = ++a; // Pre-increment
        System.out.println(b); //13

        int c = 10;
        System.out.println(c++ + c++ ); // 21
        System.out.println(c++ + ++c ); // 26
//Decrement
        int d = 10;
        System.out.println(d--); //10 | Post-decrement
        System.out.println(d-- +d ); // 17

        int e = --d; // Pre-decrement
        System.out.println(e); //7

        int f = 10;
        System.out.println(f-- + f-- ); // 19
        System.out.println(f-- + --f ); // 14







    }
}
