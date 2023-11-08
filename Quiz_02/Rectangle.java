package Quiz_02;

import java.util.Scanner;

public class Rectangle {

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
    public float calculateArea(){
        Rectangle r= new Rectangle();
        return r.width()*r.length();
    }

    public static void main(String[] args) {
    Rectangle area = new Rectangle();
        System.out.println(area.calculateArea());
    }

}
