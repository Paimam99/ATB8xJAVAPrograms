package September.EX27_2024;

import java.util.Scanner;

public class LAB032 {
    public static void main(String[] args) {
        /* TRIANGLE CLASSIFIER
        IF THE TRIANGLE IS EQUILATERAL (ALL THE SIDES ARE EQUAL),
        ISOSCELES (EXACTLY TWO SIDES ARE EQUAL),
        OR SCALENE (NO SIDES ARE EQUAL)
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side 1: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of side 2: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of side 3: ");
        double side3 = sc.nextDouble();

        // Check for negative or zero values
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Side lengths must be positive numbers. Please enter valid side lengths.");
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            // Check for triangle inequality violation
            System.out.println("The side lengths do not form a valid triangle.");
        } else {
            // Classify the triangle based on the side lengths
            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        }
    }
}

