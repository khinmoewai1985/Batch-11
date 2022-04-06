package controlflow;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.print("Enter your num1 :");
        int num1 = new Scanner(System.in).nextInt();

        System.out.print("Enter your num2 :");
        int num2 = new Scanner(System.in).nextInt();

        System.out.print("Enter your make operator :");
        String operator = new Scanner(System.in).nextLine();

        if(operator.equals("+")){
            System.out.println(num1+num2);
        }else if(operator.equals("-")) {
            System.out.println(num1-num2);
        }else if(operator.equals("*")){
            System.out.println(num1*num2);
        }else if(operator.equals("/")){
            System.out.println(num1/num2);
        }else if(operator.equals("%")){
            System.out.println(num1%num2);
        }else {
            System.out.println("your system is error");
        }






    }
}
