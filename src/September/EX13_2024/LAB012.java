package September.EX13_2024;

import javax.sound.midi.SysexMessage;

public class LAB012 {
    public static void main(String[] args) {
        System.out.println("Hello WOrld !");
        System.out.print("Hi");

        System.out.print("Hi");
        System.out.println("Hello WOrld !");

//        Formatting printf()
        /* %d - any integer, byt, short, long
        %s - String
        %c - Char
        % f - float, double */

        int num = 2;
        System.out.printf("Value of %d",num);
        System.out.println();

//        Task of the day

        String name = "Abhay";
        String last_name = "Pai";
        System.out.printf("Your %s %s correct",name,last_name);
        System.out.println();

//        Literals
        /* 1. Integral type
        2. Binary type
        3. Hexadecimal type
        4. Octal type
         */
        int hex = 0Xface; // base 16
        boolean is_married = true;
        boolean is_Married = false;

//        Character literals
        // Single character
        char c = 'A';
        char c1 = 'z';

        // Escape char
        char new_line = '\n'; // moves to next line
        char tab_line = '\t'; // added tab between words
        char back_space = '\b'; // last character is deleted
        char car_r = '\r';// delets previous char

        System.out.println("Abhay"+'\n'+"Pai");
        System.out.println("Abhay"+'\t'+"Pai");
        System.out.println("Abhay"+'\b'+"Pai");
        System.out.println("Abhay"+'\r'+"Pai");

//        Unicode
        System.out.println('\u1F60');








    }
}
