package Quiz_02;

import java.util.Scanner;

public class Calculator {
    public int sum(){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=s.nextInt();
        System.out.print("Enter Number: ");
        int y= s.nextInt();
        return x+y;
    }
    public int multiplication(){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=s.nextInt();
        System.out.print("Enter Number: ");
        int y= s.nextInt();
        return x*y;
    }
    public int subtraction(){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=s.nextInt();
        System.out.print("Enter Number: ");
        int y= s.nextInt();
        return x-y;
    }
    public double division(){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=s.nextInt();
        System.out.print("Enter Number: ");
        int y= s.nextInt();
        return (double) x /y;
    }


    public static void main(String[] args) {
        Calculator c= new Calculator();
        System.out.println(c.sum());
        System.out.println(c.multiplication());
        System.out.println(c.subtraction());
        System.out.println(c.division());

    }

}
