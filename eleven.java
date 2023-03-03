//greatest of  three number using nested ifelse using ternary operator
public class eleven {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 3;
        int max = 0;
        max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println(max);


    }
}
