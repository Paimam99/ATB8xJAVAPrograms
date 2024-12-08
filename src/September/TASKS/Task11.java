package September.TASKS;

import java.util.Scanner;
// Triangle Classifier
public class Task11 {
    public static void main(String[]args){
/*
IF THE TRIANGLE IS EQUILATERAL ( ALL THE SIDE ARE EQUAL )
ISOSCELES ( EXACTLY TWO SIDES ARE EQUAL ) OR
SCALENE (NO SIDES ARE EQUAL)
 */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side 1: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of side 2: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of side 3: ");
        double side3 = sc.nextDouble();

        if (side1 == side2 && side1 == side3 && side2 == side3){
            System.out.println("Equilateral Traingle");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene");
        }
    }
    }

