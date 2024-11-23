package Arrays;

public class arraySumAvarage {
    public static void main(String[] args) {
        int[] numArray = arrayUtility.arrayInput();

        long sum = sum(numArray);
        int Average = Average(numArray);

        System.out.println("The sum of Array is: "+ sum);
        System.out.println("Average is: "+ Average);

    }
    public static long sum(int[] numArray){

        long sum = 0;
        int i=0;
        while(i<numArray.length){
            sum+=numArray[i];
            i++;
        }
        return sum;
    }

    public static int Average(int[] numArray){

        long sum = sum(numArray);

        int average =(int) (sum/numArray.length);

        return average;

    }
}
