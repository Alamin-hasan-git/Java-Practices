import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Length: ");
        float len = input.nextFloat();
        System.out.print("Enter Width: ");
        float wid = input.nextFloat();

        float PoR = (len+wid)*2;

        System.out.println("The Perimeter of Rectangle is: "+ PoR);


    }
}
