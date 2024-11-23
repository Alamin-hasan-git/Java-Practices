import java.util.Scanner;

public class simpleInterestRate
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int p = input.nextInt();
        System.out.print("Enter Interest rate: ");
        float i = input.nextFloat();
        System.out.print("Enter Time Span: ");
        int t = input.nextInt();

        float si = (p*i*t)/100;
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Main Balance : "+p);
        System.out.println("Total Interest : "+si);
        System.out.println("End Balance: "+(p+si));
    }
}
