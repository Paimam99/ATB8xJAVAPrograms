package September.EX16_2024;

public class LAB016 {
    public static void main(String[] args) {
//        Relational operators
//        >< , <= , >= , != , ! - return values in True or False
        /*
        > - Greater than
        < - Less than
        >= - Greater than or equal to
        <= - Less than or equal to
        = - Equal to
        != - Not equal to
         */
        int a = 10;
        int b = 20;
        boolean c = a < b;
        System.out.println(c);

//        Logical operators
//         OR ||
//         AND  &
//        ! NOT
        System.out.println(10==10); // true
        System.out.println(10>=10); // true
        System.out.println(10<=10); // true
        System.out.println(10>10); // false
        System.out.println(10<10); // false

        boolean d = true;
        System.out.println(!d); //fasle
        System.out.println(!(10>20)); // true
        System.out.println(!!!!(30>90)); //false
        //System.out.println((30>90)!); - operator can't be used at the end

//        OR OPERATOR
        System.out.println(true || false); //true
        System.out.println(true || true); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

//        AND OPERATOR
        System.out.println(true && true); // true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

        int i = 12;
        boolean w = !(i > 10 || i < 5);
        System.out.println(w); // false

//        New operator
//        Instance of Operator




    }
}
