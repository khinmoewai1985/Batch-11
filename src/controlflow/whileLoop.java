package controlflow;

public class whileLoop {
    public static void main(String[] args) {

        int a =1;
        int b=10;

         while(a<10) {
             System.out.println(a);
             a++;
         }

         do {
             System.out.println(b + "\t");
             b+=2;
         }while(b<20);

    }
}
