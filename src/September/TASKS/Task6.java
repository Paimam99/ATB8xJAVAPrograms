package September.TASKS;

import javax.sound.midi.SysexMessage;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
// Triangle classifier , FizzBuzz Problem
//        Write a program that prints number from 1 to 100
//        However, for multiplies of 3, Print "Fizz" instead of the number, and for multiples of 5,
//        print "Buzz". For numbers that are multiples of both , print "FizzBuzz".

/*
Step 1 : logic building
Input  - int n = 100 - Scanner Class
Output - String - Fizz, buzz and Fizzbuzz

Step 2: Rough logic
for - int = 1 to i <=100 (n)
i - multiple of 3 - modules - i%3 == 0 - Fizz
i - multiple of 5 - modules - i%5 == 0 - Buzz
i - multiple of 3,5 - modules - i%3 && i%5 == 0 - FizzBuzz
i

Step 3 : Execution
 */

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number n = 100");
        int n = sc.nextInt();

        for (int  i = 1; i<=100; i++){
            if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else if (i % 3 == 0 && (i % 5) == 0){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }
        }


    }
}
