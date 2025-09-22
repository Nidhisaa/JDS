import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n, first=0, second=0, sum=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();{
            for(int i=1; i<=n; i++){
                first = second;
                second=sum;
                sum= first+second;
            }


    
}
    }
}