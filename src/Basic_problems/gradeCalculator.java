import java.awt.geom.Arc2D;
import java.util.Scanner;

public class gradeCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        float n = input.nextFloat();

        if (n>=90 )
        {
            System.out.println("Your Grade is: 'A+'." );

        }else if (n>=75)
        {
            System.out.println("Your Grade is: 'A'.");
        } else if (n>=60)
        {
            System.out.println("Your Grade is: 'A-'.");
        } else if (n>=30) {
            System.out.println("Your Grade is: 'B'.");
        } else
        {
            System.out.println("Your Grade is: 'F'.\nWork Hard.");
        }
    }
}

