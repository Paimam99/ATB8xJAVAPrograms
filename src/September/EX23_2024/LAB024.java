package September.EX23_2024;

public class LAB024 {
    public static void main(String[] args) {
        int itemCode = 006;
        switch (itemCode) {
            case 001, 002, 003 -> System.out.println("This is electronic section");
            case 004, 005, 006-> System.out.println("This is mechanical section"); // Correct answer
            default-> System.out.println("Out of stock");
        }
    }
}
