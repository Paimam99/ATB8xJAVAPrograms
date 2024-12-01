package September.EX25_2024;

public class LAB029 {
    public static void main(String[] args) {
        for (int s = 1; s <= 10; s++) {
            if (s == 5) {
                System.out.println("Five");
            } else {
                System.out.println(s); // Five is printed instead of 5
            }
        }
        for (int a = 0; a < 10; a++) {
            System.out.println(a);
            if (a == 5) {
                continue;
            }
            System.out.println("After");
        }
        for (int a = 0; a < 10; a++) {
            System.out.println(a);
            if (a == 5) {
                break;
            }
            System.out.println("After");
        }
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println(i);
        }
    }
}