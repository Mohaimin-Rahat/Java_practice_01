package Control_Flow;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = s.nextInt();


        while (num%2==0){
            System.out.println("Even Number");
            break;
        }
        while (num%2!=0){
            System.out.println("Odd Number");
            break;
        }


    }
}
