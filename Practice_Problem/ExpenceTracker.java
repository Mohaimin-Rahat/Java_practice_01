package Practice_Problem;

import java.util.Scanner;

public class ExpenceTracker {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Rent :");
        double rent = s.nextDouble();
        System.out.print("Enter Groceries :");
        double groceries = s.nextDouble();
        System.out.print("Enter Entertainment :");
        double entertainment = s.nextDouble();
        System.out.print("Enter Transportation :");
        double transportation = s.nextDouble();

        if (rent>groceries && rent > entertainment && rent > transportation){
            System.out.println("Rent is the highest expense");
        } else if (groceries > entertainment && groceries > transportation ) {
            System.out.println("Groceries is the Highest Expense");
        }
        else if (entertainment > transportation){
            System.out.println("Entertainment is the Highest Expense");
        }
        else {
            System.out.println("Transportation is the highest expense");
        }
    }



}