package September.EX27_2024;

public class LAB031 {
    public static void main(String[] args) {
//         do while loop (int - body - condition- increment/decrement)
        int a = 0;
        do {
            System.out.println("Print "+a);
            a++;
        }while (a<10);

        int h = 0;
        do {
            System.out.println("Print "+h);
            h++;
        }while (h<0);

        int age = 18;
        do {
            System.out.println("Go to Vote ");
            age++;
        } while (age < 18); // age > 18 will lead to continue loop of "Go to Vote".


    }
}
