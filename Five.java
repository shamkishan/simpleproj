//5> WAP in Java to print factorial of any number
public class Five {
    public static void main(String[] args) {
        int x=5;
        int fact = 1;
        System.out.print("Enter any number to print Factorial: ");
        for(int i=1; i<=x; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
