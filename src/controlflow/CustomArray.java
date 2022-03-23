package controlflow;

public class CustomArray {
    public static void main(String[] args) {
        //initialize an array
        int numbers[]= {1,3,3,14,5,6,7,8};

        int copy[]= new int [numbers.length];

        for(int i=0; i< copy.length;i++) {
            System.out.print(copy[i]+"\t");
        }
        System.out.println();

        //copy
        for(int i=0; i< numbers.length;i++){
            copy[i]=numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(copy[i]+ "\t");
    }
        System.out.println();

        //Find Largest Number
        int largestNumber =0;
        for(int i=0 ;i<numbers.length; i++)
        {
            if (numbers[i]>largestNumber)
            {
                largestNumber=numbers[i];
            }

        }
        System.out.print(largestNumber);
        System.out.println();

        int smallNumber=5;
        for(int i=0; i<numbers.length;i++)
        {
            if(numbers[i] <= smallNumber)
            {
                smallNumber=numbers[i];
            }
        }
        System.out.print(smallNumber);
    }
}
