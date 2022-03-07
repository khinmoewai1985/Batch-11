package com.codewall.calculator;

public class Operators {

    public static void main(String[] args) {

        boolean flag = 3>4 && 4>3;
        boolean flag1 = 3>4 & 4>3;

        boolean truth = 4>3 & 3==4;
        System.out.println(truth);

        int number=10 << 3;
        System.out.println(number);

        int number1=20 << 2;
        System.out.println(number1);

        int number2=15 << 4;
        System.out.println(number2);

        int number3=20 >> 2;
        System.out.println(number3);

        int number4=20 >> 3;
        System.out.println(number4);

        int b=45;
        b=b++;
        System.out.println(b);

        int a=40;
        a=++a;
        System.out.println(a);

        int num = 20;
        int num1 = 50;
        int result=(num>num1)?num:num1;
        System.out.println(result);






    }

}
