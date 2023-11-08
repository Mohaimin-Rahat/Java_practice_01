package Quiz_02;

import java.util.Scanner;

public class Square {
    public float length(){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Length: ");
        float x=s.nextFloat();
        return x;
    }
    public float width(){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Width: ");
        float y=s.nextFloat();
        return y;
    }
    public float calculatePerimeter(){
        Square s= new Square();
        return s.width()*s.length();
    }

    public static void main(String[] args) {
        Square sq= new Square();
        System.out.println(sq.calculatePerimeter());
    }
}
