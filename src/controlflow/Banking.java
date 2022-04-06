package controlflow;

public class Banking {

    int id;
    String name;
    double cash;

    public Banking(int id, String name, double cash) {
        this.id = id;
        this.name = name;
        this.cash = cash;
    }

    void addamount(double in){

        //increase cash
        cash += in;
    }

    void withDraw(double out){
        if(cash >out){
            cash -= out;

        }else if(cash < out){

            cash = cash-out;
            System.out.println("your amount is lower");
        }


    }

    public static void main(String[] args) {

    Banking user1 = new Banking(1,"Ma",10000);
        System.out.println("user1 "+user1.cash);

        user1.addamount(40000);
        System.out.println("user1 "+user1.cash);

//        user1.withDraw(20000);
//        System.out.println(user1.cash);

        user1.withDraw(60000);
//        System.out.println("user1 "+user1.cash);

        Banking user2 = new Banking(2,"Mg",50000);
        System.out.println("user2 "+user2.cash);

        user2.addamount(40000);
        System.out.println("user2 "+user2.cash);

        user2.withDraw(60000);
       System.out.println("user2 "+user2.cash);
    }
}
