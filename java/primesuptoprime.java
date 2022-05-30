import java.lang.*;
import java.util.Scanner;

class primes
{
    int n;
    primes(int n)
    {
        this.n = n;
    }

    void printprimes()
    {
        if (n<2)
            System.out.println("There are no primes below this number.");
        else
        {
            System.out.println("The required primes are: ");
            for(int i=2; i<=n; i++)
            {
                int f=0;
                for(int j=2; j<=i/2; j++)
                {
                    if (i%j == 0)
                    {
                        f = 1;
                        break;
                    }
                }
                if (f==0)
                    System.out.println(i+ " ");
            }
        }
    }
}

class primesuptoprime
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            primes ob = new primes(n);
            ob.printprimes();
        }
    }
}