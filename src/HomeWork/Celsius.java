package HomeWork;

import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {

        System.out.println("Enter to Celsius");
        double celsius = new Scanner(System.in).nextDouble();

        double Fahrenheit = 9/5*celsius+32;

        System.out.println("Celsius to Fahrenheit "+Fahrenheit);

    }
}
