package September.EX16_2024;

public class LAB015 {
    public static void main(String[] args) {
//        Unary operator
        int a = 56;
        int bb = -1;
        System.out.println(a);
        System.out.println(bb);
        System.out.println(bb-bb);

        String first_name = "Abhay";
        String last_name = "Pai";
        int b = 10;
        System.out.println(first_name+last_name+a+b);
        System.out.println(a+b+first_name+last_name);

//        Compound assignment operator
        // += , -=, *=, /=
        a+=20;
        System.out.println(a); // 76

        a-=20;
        System.out.println(a); // 56

        a*=20;
        System.out.println(a); // 1120

        a/=20;
        System.out.println(a); // 56







    }
}
