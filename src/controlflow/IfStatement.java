package controlflow;

import java.sql.SQLOutput;

public class IfStatement {

    public static void main(String[] args) {

        int a = 10;
        int b = 9;

        if(a>b) {
            System.out.println(a + " is the gearter than " + b);
        }

        if(a<b) {
            System.out.println((a<b)+ " statement");
        } else {
            System.out.println((a<b)+ "statement");
        }

        int mark = 80;
        if(mark <40){
            System.out.println("Fail");
        }else if(mark >=40 && mark < 80) {
            System.out.println("Pass");
        }else {
            System.out.println("D");
        }





    }

}
