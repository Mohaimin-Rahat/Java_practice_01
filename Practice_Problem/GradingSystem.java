package Practice_Problem;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks:");
        int mark = s.nextInt();
        String grade = null;

        if (mark <=100 && mark>=90){
            grade="A";
        } else if (mark >=80) {
            grade= "B";
        } else if (mark>=70) {
            grade= "C";
        } else if (mark>=60) {
            grade = "D";
        }
        else {
            grade ="F";
        }
        System.out.println("Result is :"+grade);
    }
}
