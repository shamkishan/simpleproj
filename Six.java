import java.util.Scanner;

//6> WAP in Java to print factorial of user input number
public class Six {
    public static void main(String[] args) {
        int x;
        int fact = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number to print table");
        x = s.nextInt();
        for(int i=1; i<=x; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
