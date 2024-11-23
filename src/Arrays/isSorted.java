package Arrays;

public class isSorted {
    public static void main(String[] args) {
        int[] array = arrayUtility.arrayInput();

        boolean isDec = isDecreasing(array);
        boolean isInc = isIncreasing(array);
        if(isDec || isInc){
            System.out.println("Your Array is Sorted.");
        }
        else System.out.println("Your Array is not Sorted;");
    }
    public static boolean isIncreasing(int[] array) {
        int i = 1;
        while (i < array.length) {
            if (array[i] < array[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[] array){

        int i = 1;
        while (i < array.length) {
            if (array[i] > array[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
