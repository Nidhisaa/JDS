import java.util.*;

public class sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, count = 0, sum = 0, r;
        System.out.print("Enter the number: ");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
            count++;
        }

        System.out.println("SUM: " + sum);  
        System.out.println("Number of Digits: " + count);

        sc.close();
    }
}
