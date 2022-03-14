package controlflow;

public class ArrayCopy {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        int copy[] = new int[5];

        System.arraycopy(numbers,0,copy,0,5 );

        for (int i = 0; i < copy.length; i++) {

            System.out.println(copy[i]);
        }

            //clone array
        int another[] = copy.clone();
        for (int i = 0; i < another.length; i++) {

            System.out.print(another[i]+"\t");
        }

    }
}
