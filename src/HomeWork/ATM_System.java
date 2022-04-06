package HomeWork;

public class ATM_System {

    int id;
    String name;
    double amount;
    int password;

    public ATM_System(int id, String name, double amount, int password) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.password = password;
    }

    void account(double cash){
        if(amount >cash){
            amount-= cash;
        }else if(amount < cash){
            System.out.println("your system is failed");
        }

    }

    public static void main(String[] args) {

        ATM_System system = new ATM_System(1,"Pont",500000,123);
        System.out.println("User "+system.id);
        System.out.println("User "+system.name);
        System.out.println("User "+system.amount);
        System.out.println("User "+system.password);

        system.account(200000);
        System.out.println("your system is success "+system.amount);

        system.account(400000);


    }
}
