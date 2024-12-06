package September.EX25_2024;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class LAB030 {
    public static void main(String[] args) {
//      while loop (initialization, condition, execution)
        int i = 0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
//        For loop
        for (int j = 0;j<=10;j++){
            System.out.println(j);
        }

        String originalStr = "Hello";
        String reversedStr = " ";
        System.out.println("Original string: "+originalStr);
        for (int q =0; q<originalStr.length();q++){
            reversedStr = originalStr.charAt(q)+reversedStr;
        }
        System.out.println("Reverse string: "+reversedStr);
     }
    }

