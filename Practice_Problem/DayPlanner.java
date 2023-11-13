package Practice_Problem;

import java.util.Scanner;

public class DayPlanner {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Day: (e.g: Saterday,Sunday,Monday,Tuesday,Wednesday,Thrusday,Friday )");
        String day=s.next();

        switch(day) {
            case "Sunday":
                System.out.println("Weekend");
                break;

            case "Monday":
                System.out.println("Start of week");
                break;

            case "Tuesday":
                System.out.println("Work day of week");
                break;
            case "Wednesday":
                System.out.println("Busy day");
                break;
            case "Thrusday":
                System.out.println("Long day");
                break;
            case "Friday":
                System.out.println("Short Day");
                break;

            default:
                System.out.println("Invalid Input");
        }
    }

}
