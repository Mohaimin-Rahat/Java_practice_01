package Practice_Problem;

import java.util.Scanner;

public class MovieMarathon {

    public static void main(String[] args) {
        int time= 0;
        int limit= 300;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Movie Duration:");
        int duration = s.nextInt();

        while (time + duration <= limit){
            time += duration;
            System.out.println("Still Streaming Movie");
        }
        System.out.println("Time Exceeds");
    }


}
