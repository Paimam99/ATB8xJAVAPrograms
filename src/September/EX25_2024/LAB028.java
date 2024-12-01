package September.EX25_2024;

public class LAB028 {
    public static void main(String[] args) {
//       final boolean b1 = true;
//       for (int i= 0;b1;i++){
//           System.out.println(b1); // infinite printing loop
//       } ;; if no condition then it's a infinite loop;;

       int a = 10; // decrement
       for( ;a>0;a--){
           System.out.println(a);
       }

       for (int b = 0; b<10; b++){
           System.out.println("JAI SHREE RAM");
       }
       System.out.println("END");

       for (int s = 1; s<=10;s++){
           if (s==5){
               System.out.println("Five");
           }else{
               System.out.println(s); // Five is printed instead of 5
           }
       }

    }
}
