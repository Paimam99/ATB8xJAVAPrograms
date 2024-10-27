package September.EX20_2024;

public class LAB021 {
    public static void main(String[]args){
//         Grade Calculator
/*  Write a program that calculates and displays hee letter grade for the given numerical score
    (e.g: A, B, C, D ,E OR F)
    based on the following grading scale:
    A :  90- 100
    B : 80 -89
    C : 70 - 79
    D - 60 - 69
    F - 0 - 59

    90 -> A
    87 -> B
    23 -> F
    Logic building Java

    1. Find the user inputs
    score -> int score = 89
    return -> data - type - grade -> char

    2. Basic logic
    if (score >= 90 && score <=100) -> return print grade - A
    else if (score >=80 && <=89) return or print grade -B
    else if score >= 70 && <= 79 -> return or print grade - C, D, E
    else -> grade - F
 */

//        3. Write the code
        char grade = 'F';
        int score = 89; // input to be updated from user.

        if (score >=90 && score <=100) {
            grade = 'A';
        } else if (score >= 80 && score <=89){
            grade = 'B';
            }else if(score >=70 && score <= 79) {
            grade = 'C';
        }else if (score >= 60 && score <=69) {
            grade = 'D';
        }else if (score <=0  || score>100) {
            System.out.println("LOL ");
            grade = 'O';
        }else {
            grade = 'F';
        }
        System.out.println("Your Grade is ->"+ grade);

        }

    }
