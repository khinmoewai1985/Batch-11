package controlflow;

public class JavaArray {
    public static void main(String[] args) {

        int number[]={10,20,30,40,50};
        System.out.println(number[3]);

        String names[]= new String[]{"Mg Mg","Ma Ma","CodeWall","Technologies"," "};
        System.out.println(names.length);

        String cars[]= new String[4];
        cars[0]="marcedes";
        cars[1]="toyota";
        cars[2]="Lamborghini";
        System.out.println(cars[2]);;

        cars[2]="page";
        System.out.println(cars[2]);

        for (int i=0; i<cars.length; i++){ //for loop
            System.out.println(cars[i]);
        }
        System.out.println();

        for (String name: names) { //foreach loop
            System.out.println(name+"\t");
        }

        for (int i =cars.length -1; i>=0; i--){ //for loop last restrict
            System.out.println(cars[i]);
        }

    }
}
