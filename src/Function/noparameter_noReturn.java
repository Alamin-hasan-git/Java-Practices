package Function;

import java.util.Scanner;

public class noparameter_noReturn {
    public static void main(String[] args) {
       AreaofTriangle();
    }
    public static void AreaofTriangle(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Length:");
        float n1 = input.nextFloat();
        System.out.print("Enter  Width: ");
        float n2 = input.nextFloat();

        float Aot = (n1*n2)/2;

        System.out.println("The Area of Triangle is: "+ Aot);
    }
}
