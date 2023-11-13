package Control_Flow;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Range:");
        int range =s.nextInt();
        System.out.println("Prime Numbers are:");
        System.out.print("2 3 ");


        for (int i = 1; i<=range; i++){
            int out = 6*i-1;
            int res= 6*i+1;
            System.out.print(out+" "+res+" ");
        }


    }
}
