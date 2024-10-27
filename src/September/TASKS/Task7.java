package September.TASKS;

public class Task7 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        String Operation = "addition";

        switch (Operation){
            case "addition" -> System.out.println(num1 + num2);
            case "substraction" -> System.out.println(num1 - num2);
            case "Multiplication" -> System.out.println(num1 * num2);
            case "Division" -> System.out.println(num1 / num2);
            case "Modulus" -> System.out.println(num1 % num2);
            default -> System.out.println("Enter Valid Value");

        }
    }
}
