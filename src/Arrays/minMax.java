package Arrays;

public class minMax {
    public static void main(String[] args) {

        int[] Array = arrayUtility.arrayInput();

        int Min = min(Array);
        int Max = max(Array);


        System.out.println(Max+" is the maximum value in this Array");
        System.out.println(Min+" is the minimum value in this Array");
    }

    public static int max(int[] Array){
        if(Array.length == 0){
           return Integer.MIN_VALUE;
        }
        int max = Array[0];
        int i=1;
        while(i<Array.length){
            if(max < Array[i]) {
                max = Array[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] Array){

        int min = Integer.MAX_VALUE;
        int i=0;
        while(i<Array.length){
            if(min>Array[i]) {
                min = Array[i];
            }
            i++;
        }
        return min;
    }
}
