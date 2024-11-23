import java.util.Scanner;

public class productOf2numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        float n1 = input.nextFloat();
        System.out.println("Enter Second Number: ");
        float n2 = input.nextFloat();

        float product = n1*n2;
        System.out.println(product);
    }
}
