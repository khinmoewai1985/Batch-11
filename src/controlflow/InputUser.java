package controlflow;

import java.util.Scanner;

public class InputUser {

    public static void main(String[] args) {

        System.out.println("Enter your number1: ");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();




     if(userInput == 0){
         System.out.println("your number is even");
     }else if(userInput == 1){
         System.out.println("your number is odd");
     }else {
            System.out.println("your number is error");
        }


    }
}
