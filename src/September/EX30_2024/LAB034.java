package September.EX30_2024;

public class LAB034 {

    public static void main(String[] args) {
        // Calling the methods in the main method
        function_type1();
        String name = function_type2();
        function_type3("Hello");
        int sum = function_type4(5, 3);
        System.out.println("4. With Parameter and with return type, Sum: " + sum);
    }

    // 1. Without Parameters and without return type
    public static void function_type1() {
        System.out.println("1. Without Parameters and without return type");
    }

    // 2. Without Parameter but with Return Type
    public static String function_type2() {
        System.out.println("2. Without Parameter but with Return Type");
        return "Abhay"; // Returning a string
    }

    // 3. With Parameter and without return type
    public static void function_type3(String message) {
        System.out.println("3. With Parameter and without return type: " + message);
    }

    // 4. With Parameter and with return type
    public static int function_type4(int a, int b) {
        System.out.println("4. With Parameter and with return type");
        return a + b; // Returning the sum of the two integers
    }
}
