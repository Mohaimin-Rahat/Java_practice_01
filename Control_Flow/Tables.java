package Control_Flow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Table Number:");
            int num = s.nextInt();

//        for (int i=1;i<=10;i++){
//            System.out.println(num+"*"+i +":"+(i*num));
//        }

            int n = 1;

            do {
                System.out.println(num + "*" + n + ":" + (n * num));
                n++;
            } while (n <= 10);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
