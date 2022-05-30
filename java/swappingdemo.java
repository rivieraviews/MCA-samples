import java.util.Scanner;

class swapping
{
    int x, y;
    swapping(int a, int b)
    {
        x = a;
        y = b;
    }

    void swapvalues()
    {
        x = x+y;
        y = x - y;
        x = x - y;
    }

    void display()
    {
        System.out.println("The swapped values are: \nn: "+ x +"\nm: "+ y);
    }
}

class swappingdemo
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            System.out.println("n: ");
            int n = sc.nextInt();
            System.out.println("m: ");
            int m = sc.nextInt();
            swapping ob = new swapping(n,m);
            ob.swapvalues();
            ob.display();
        }
    }
}