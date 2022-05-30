import java.lang.*;
import java.util.Scanner;

class factorial
{
    public static void facts(int n)
    {
        int f=1;
        for(int i=2; i<=n; i++)
            f = f*i;
        System.out.println("The factorial is: "+f);
    }

    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            facts(n);
        }
    }
}