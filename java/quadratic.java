class quadroots
{
    int a, b, c;
    double d, r1, r2;
    quadroots(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
        d = 0.0;
        r1 = 0.0;
        r2 = 0.0;
    }

    void roots()
    {
        d = b*b - 4*a*c;
        if (d>0)
        {
            r1 = (-b + Math.pow(d, 0.5))/(2*a);
            r2 = (-b - Math.pow(d, 0.5))/(2*a);
        }
        else if (d == 0)
            r1 = (-b)/(2.0*a);
    }

    void display()
    {
        if (d<0)
            System.out.println("The roots are imaginary.");
        else
        {
            System.out.println("The roots are: " + r1 + " and " + r2);
        }
    }
}

class quadratic
{
    public static void main(String args[])
    {
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values of a, b, and c");
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();*/
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        quadroots ob = new quadroots(a, b, c);
        ob.roots();
        ob.display();
    }
}
