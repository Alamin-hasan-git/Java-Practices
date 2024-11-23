package Function;

import java.util.Scanner;

 class sumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your numbers: ");
        long num = input.nextLong();
        float sod = sumofDigits(num);

        System.out.println("Your result is: "+ sod);

    }

    public static float sumofDigits(long num) {
        float sod =0;
        while(num!=0) {
            float rem = (num % 10);
            sod = sod + rem;
            num = num / 10;
        }
         return sod;
    }
}
