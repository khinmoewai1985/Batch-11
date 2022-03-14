package controlflow;

public class switchStatement {
    public static void main(String[] args) {

        int a = 5;
        String day ="monday";
        String str="weekend";

        switch (a) {
            case 1:
                System.out.println(a + " is equal to 1");
                break;
            case 2:
                System.out.println(a + " is equal to 2");
                break;
            case 3:
                System.out.println(a + " is equal to 3");
                break;
            case 4:
                System.out.println(a + " is equal to 4");
                break;
            case 5:
                System.out.println(a + " is equal to 5");
                break;
            default:
                System.out.println("something is wrong");

        }

        switch (day) {
            case "monday":
                System.out.println(day+" " + str);
                break;
            case "tuesday":
                System.out.println(day+" " + str);
                break;
            case "wednesday":
                System.out.println(day+" " + str);
                break;
            case "thursday":
                System.out.println(day+" " + str);
                break;
            case "Friday":
                System.out.println(day+" " + str);
                break;
            default:
                System.out.println("Weekend");

        }


    }
}
