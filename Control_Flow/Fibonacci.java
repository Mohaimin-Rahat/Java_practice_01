package Control_Flow;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int input = s.nextInt();
        int x=0;
        int y=1;
        System.out.print(x+" "+y);
        int z=0;
        for (int i=2; i<input;++i){
            z=x+y;
            System.out.print(" "+z);
            x=y;
            y=z;
        }
    }
}
