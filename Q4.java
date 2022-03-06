import java.util.Scanner;

public class Q4 {

    public void equation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter x");
        int x = scanner.nextInt();

        System.out.println("please enter n ");
        int n = scanner.nextInt();

        calc(x,n);
    }

    public void calc(int x, int n) {
        double sum = 0;
        int i = 1;
        int iteration = 1;
        int j = 2;

        while(i <= n) {
            if(iteration % 2 != 0){
                sum = sum - (Math.pow(x,j) / factorial(i));
                iteration++;
                i++;
                j = j +2;
            }
            else{
                sum = sum + (Math.pow(x,j) / factorial(i));
                iteration++;
                i++;
                j = j + 2;
            }
        }
        System.out.println(sum);
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}