package controlflow;

public class initializeObject {

    int id;
    String name;

    void str(int i,String name1){
        this.id = i;
        this.name = name1;
    }
    public static void main(String[] args) {

        initializeObject method = new initializeObject();
        method.str(38,"Pont Pont");

        System.out.println(method.id);
        System.out.println(method.name);




    }
}
