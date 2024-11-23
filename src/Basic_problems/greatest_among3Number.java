import java.util.Scanner;

public class greatest_among3Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        if(n2<n1 && n3<n1)
        {
            System.out.println("The large number is: "+ n1);
        }
        else  {

            if (n1<n2 && n3<n2)
            {
                System.out.println("The large Number is: "+ n2);
            }
            else
            {
                System.out.println("The large number is: "+n3);
            }

        }
    }
}
