import java.util.Scanner;

public class Create_a_program_that_takes_two_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int n1= input.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = input.nextInt();

        System.out.println("--------Sum--------");
        int sum=n1+n2;
        System.out.println(sum);

        System.out.println("------Subtraction-----");
        int sub=n1-n2;
        System.out.println(sub);

        System.out.println("-------Multiply-------");
        int mul=n1*n2;
        System.out.println(mul);

        System.out.println("------Division-------");
        float div = (float)n1/n2;
        System.out.println(div);

        System.out.println("------Modules---------");
        int mod= n1%n2;
        System.out.println(mod);

    }
}
