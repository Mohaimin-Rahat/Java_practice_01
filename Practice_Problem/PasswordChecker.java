package Practice_Problem;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        String pass = "123@xyz";
        int attempt= 0;

        Scanner s = new Scanner(System.in);

        String entry =null;
        do{
            System.out.println("Enter Password:");
            entry = s.next();
            attempt ++;
        }while (!entry.equals(pass) && attempt<3);

        if (entry.equals(pass)){
            System.out.println("Login Success");
        }
        else {
            System.out.println("Multiple Attempt");
            System.out.println("Login Unsuccessful");
        }
    }
}
