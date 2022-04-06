package HomeWork;

import java.util.Scanner;

public class AreaOfCircle {


    public static void main(String[] args) {

        double p = 3.14;

        System.out.println("Enter your radius :");
        int radius = new Scanner(System.in).nextInt();

        double Area = p*radius*radius;

        System.out.println("Area of Circle "+Area);


    }
}
