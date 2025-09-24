import java.util.Scanner;
public class prime { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n, count=0;
        n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(n % i ==0)
            count++;
        }
        if(count==2)
        {
          System.out.print("Prime");
        }
        else
          System.out.print("Composite");
        }
    
}
