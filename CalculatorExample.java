import java.util.Scanner;

class Add extends Thread
{
    int a, b;

    Add(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void run()
    {
        System.out.println("Addition " + (a + b));
    }
}

class Subtract extends Thread
{
    int a, b;

    Subtract(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void run()
    {
        System.out.println("Subtraction " + (a - b));
    }
}

class Multiply extends Thread
{
    int a, b;

    Multiply(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void run()
    {
        System.out.println("Multiplication " + (a * b));
    }
}

class Division extends Thread
{
    int a, b;

    Division(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void run()
    {
        System.out.println("Division " + (a / b));
    }
}

class CalculatorExample{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new Scanner(System.in);

        System.out.print("Enter a - ");
        int a = sc.nextInt();

        System.out.print("Enter b - ");
        int b = sc.nextInt();

        new Add(a, b).start();
        new Subtract(a, b).start();
        new Multiply(a, b).start();
        new Division(a, b).start();
    }
}
