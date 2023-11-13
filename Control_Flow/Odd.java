package Control_Flow;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter Number:");  //Input Range to check odd number
        int num = s.nextInt();


//        for (int i=1;i<num;i++) {
//            if (i % 2 != 0) {
//                System.out.println("Odd numbers between 0 to "+num+" are: " +i);
//            }
//        }

        int n = 1;
        do {
            if(n%2!=0){
            System.out.println("Odd Numbers between 0 to "+num+" are: " +n);
            }
            n++;
        }while (n<num);
    }
}
