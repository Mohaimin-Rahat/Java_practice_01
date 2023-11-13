package Control_Flow;

import java.util.Scanner;

public class Factorial {
    public static <input> int findFactorial() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int input = s.nextInt();

        int result = 1;



        for (int i = 1; i <= input; i++) {
            result = result * i;

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial : "+findFactorial());
    }
}
