
//7> WAP in Java to print fabbiano series up to 100

public class Seven {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int sum = 0;
        int n = 100;

        for(int i=0; i<=n; i++){
            System.out.println(x);
            sum = x + y;
            x = y;
            y = sum;
        }
    }
}