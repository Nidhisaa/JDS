import java.util.Scanner;

public class strrev {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, count = 0, r, rev = 0;

        System.out.print("Enter the number: ");
        n = sc.nextInt();

        int temp = n; 

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
            count++;
        }

        System.out.println("REV: " + rev);
        System.out.println("Digits Count: " + count);

        sc.close();
    }
}

    
