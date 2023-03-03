//greatest of  three number using nested ifelse using ternary operator
public class ten {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 3;

        if(num1 >= num2) {

            if(num1 >= num3) {

                System.out.println(num1);

            } else {

                System.out.println(num3);
            }

        } else {

            if(num2 >= num3) {

                System.out.println(num2);

            } else {

                System.out.println(num3);
            }

        }

    }
}
