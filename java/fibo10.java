import java.lang.*;
import java.util.Scanner;

class fibonacci
{
    int a=0, b=1, c=0;
    void fibo()
    {
        int i=0;
        while (i<10)
        {
            System.out.print(a+" ");
            c = a+b;
            a = b;
            b = c;
            i++;
        }
    }
}

class fibo10
{
    public static void main(String[] args)
    {
        fibonacci ob = new fibonacci();
        ob.fibo();
        System.out.println("\nThe object has been called and the method has been executed.");
    }
}