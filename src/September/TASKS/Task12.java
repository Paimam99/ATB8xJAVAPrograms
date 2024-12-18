package September.TASKS;

public class Task12 {
    public static void main(String[] args) {
       /*
        Example for while vs do while in Lab exercise
        Create a java program that prints the first 5 even numbers using a do while loop
        Write a java program that calculates the sum of numbers from 1 to 100 using a  while loop
        */
// First 5 even numbers
        int count = 0;
        int number = 0;
        do {
            System.out.println(number);
            number +=2;
            count++;
        } while (count < 15);

        int odd = 1;
        int con= 0;
        do {
            System.out.println(odd);
            odd +=2;
            con++;
        } while (con <6);
    }

}
