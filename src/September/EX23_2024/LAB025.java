package September.EX23_2024;

public class LAB025 {
    public static void main(String[] args) {
//        " -> " can be used to replace the word break
        int itemCode = 001;
        switch (005) { // the code will execute for the item that are under the switch bracket, not defined as above
            case 001 -> System.out.println("This is a Laptop");
            case 002 -> System.out.println("Thi sis a Desktop");
            case 003, 004 -> System.out.println("This is a mobile");
            default -> System.out.println("Please enter valid code"); // correct answer
        }
    }
}

