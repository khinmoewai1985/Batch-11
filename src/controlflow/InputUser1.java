package controlflow;

import java.util.Scanner;

public class InputUser1 {

    public static void main(String[] args) {
        System.out.println("Enter your name :");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if(name == "password"){
            System.out.println(name=="password");
            System.out.println("hello");
        }else {
            System.out.println(name=="password");
            System.out.println(name);
        }
    }
}
