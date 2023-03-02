import java.util.Scanner;

//4> WAP in Java to print the table of user input num from 1 to user input
public class Four
{
    public static void main(String[] args)
    {
        int x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number to print table");
        x = s.nextInt();
        for(int i=1; i<11; i++)
        {
            System.out.println(x + "x"+ i + " = "+ x*i );
        }
    }
}
