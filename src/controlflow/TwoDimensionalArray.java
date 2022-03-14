package controlflow;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int numbers [][] = new int[4][5];
        int dNumbers[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {1,1,1,1,1},
                {5,5,5,5,5}
        };
        System.out.println(dNumbers.length);


        for(int row = 0; row<dNumbers.length;row++) {
            for(int col=0;col< dNumbers[row].length;col++) {
                System.out.print(dNumbers[row][col]);
            }
            System.out.println();
        }

        for (int[] num:dNumbers) {
            for (int n: num) {
                System.out.print(n+"\t");
            }
            System.out.println();
        }
    }

}
