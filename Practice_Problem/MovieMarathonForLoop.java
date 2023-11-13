package Practice_Problem;

import java.util.Scanner;

public class MovieMarathonForLoop {
    public static void main(String[] args) {
        //int time= 0;
        int limit= 300;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Movie Duration:");
        int duration = s.nextInt();

        for (int time=duration;time<=limit;time+=duration){
            System.out.println("Movie playing");

        }
        System.out.println("Times up");
    }

}
