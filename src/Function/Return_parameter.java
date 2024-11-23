package Function;

public class Return_parameter {
    public static void main(String[] args) {



        int s=sum(10,20);

        System.out.println(s);
    }
    //return + parameter
    public static int sum(int x , int y){
        int Sum = x+y;

        return Sum;
    }
}
