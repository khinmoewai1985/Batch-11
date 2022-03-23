package controlflow;

public class NestedIfStatement {
    public static void main(String[] args) {
        int a =45;
        if(a>40) {

            int b=20;
            if(a==b) {
                System.out.println("a is not equal to b");
            }else if(a<b) {
                System.out.println("b is not greater than to a");
            }else if(a>b){
                System.out.println("a is greater than to b");
            }

        }
    }
}
