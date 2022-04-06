package controlflow;

public class Method {

    int multiple(int num1,int num2){
        return num1+num2;
    }
    String msg(){
        return "Hello World";
    }

    void add(int a,int b){
        System.out.println(a+b);
    }

    void name(String firstName,String secondName){
        System.out.println("Your First Name is "+firstName);
        System.out.println("Your Second Name is "+secondName);

    }

    public static void main(String[] args) {

        Method method = new Method();
        method.add(2,3);
        method.add(2,4);
        method.add(2,5);
        method.add(2,6);

        Method name1 = new Method();
        name1.name("moe","wai");

        Method object = new Method();

        String greeting = object.msg();
        System.out.println(greeting);

        int result = object.multiple(4,5);
        System.out.println(result);


        Constructor obj = new Constructor(1,"Pont");




    }

}
