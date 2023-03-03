import java.util.Scanner;

//8> WAP in Java to print fabbiano series unto user input
public class Eight {
    public static void main(String[] args) {
        int x = 0; //1
        int y = 1; //1
        int sum = 0;
        int n = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter range to print fabbiano series ");
        n = s.nextInt();
        for(int i=0; i<=n; i++){
            System.out.println(x);
            sum = x + y;
            x = y; //1
            y = sum; //1
        }
    }
}