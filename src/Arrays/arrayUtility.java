package Arrays;

import java.util.Scanner;

public class arrayUtility {
    public static int[] arrayInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int num = input.nextInt();

        int arr[] = new int[num];

        int i = 0;
        while (i < num) {
            System.out.print("Enter the Element" + (i + 1) + ":");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
}
