package September.EX20_2024;

public class LAB019 {
    public static void main(String[] args) {
//        Ternary Operators  | Conditions and Loops
       // Syntax : condition ? expression_if_true / expression_if_false
        int a = (30 > 40)? 10 : 20 ;
        System.out.println(a);

        int t = 4;
        int p = 7;
        String R = t > p ? "T wins" : "P Wins";
        System.out.println(R);

        String str = 10<20 ? "10" :"TWENTY";
        System.out.println(str);

        // Max between two numbers
        int T = 4;
        int P = 7;
//         Max & Min
        int max = T> P ? T :P;
        int min = T < P ? T : P ;
        System.out.println(max); // 7
        System.out.println(min); // 4



    }
}
