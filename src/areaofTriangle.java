import java.util.Scanner;

public class areaofTriangle
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base:");
        float n1 = input.nextFloat();
        System.out.print("Enter  Height: ");
        float n2 = input.nextFloat();

        float area = (n1*n2)/2;

        System.out.println("The Area of Triangle is: " + area);

    }
}
 