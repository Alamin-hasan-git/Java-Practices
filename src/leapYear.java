import java.util.Scanner;

public class leapYear
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        if(year%400==0 || (year%4 ==0 && year%100 != 0))
        {
            System.out.println("This year is Leap Year");
        }
        else {
            System.out.println("This year is not a leap year.");
        }
    }
}
