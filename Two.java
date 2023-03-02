//2> WAP in Java to add, sub, multiply, divide and module of two number user input
import java.util.Scanner;
public class Two {
    public static void main(String[] args)
    {
        int x, y, option, add, sub, mul,mod;
        double div;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        x = s.nextInt();
        System.out.print("Enter second number:");
        y = s.nextInt();
        while(true)
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 for Module");

            option = s.nextInt();
            switch(option)
            {
                case 1:
                    add = x + y;
                    System.out.println("Result:"+add);
                    break;

                case 2:
                    sub = x - y;
                    System.out.println("Result:"+sub);
                    break;

                case 3:
                    mul = x * y;
                    System.out.println("Result:"+mul);
                    break;

                case 4:
                    div = (double) x / y;
                    System.out.println("Result:"+div);
                    break;

                case 5:
                    mod = (x % y);
                    System.out.println("Result:"+mod);
                    break;
            }
        }
    }
}