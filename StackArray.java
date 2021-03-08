import java.util.Scanner;


class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
    String str = "";


    Stack()
    {
        top = -1;
    }


    boolean isEmpty()
    {
        return (top < 0);
    }



    boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            //System.out.println(x + " pushed into stack"); 
            return true;
        }
    }


    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }



    public void print()		//for printing the stack contains
    {
        int temp=0;

        if(!isEmpty())
        {
            temp = pop();
            System.out.println(temp);
            str = str + temp;
            print();
        }
        push(temp);

    }

    public void rev() {
        char[] strrev = str.toCharArray();

        for (int i=strrev.length-1; i>=0; i--)
            System.out.print(strrev[i]);
    }
}


public class StackArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Stack stkObj = new Stack();

        int choice;
        while(true)
        {
            System.out.println("ente your choice");
            System.out.println("enter 1:  push");
            System.out.println("enter 2:  pop");
            System.out.println("enter 3:  print stack");
            System.out.println("enter 4:  reverse string");
            System.out.println("enter 5:  exit");
            choice = sc.nextInt();						//reading type value
            switch(choice)
            {
                case 1: System.out.println("Enter element which you want to push");
                    //s.nextInt();
                    stkObj.push(sc.nextInt());                   //reading integer and pushed it into the stack
                    break;

                case 2: System.out.println("Element  you want to pop is "+ stkObj.pop());
                    break;

                case 3: System.out.println("stack element is ");
                    stkObj.print();
                    break;

                case 4: System.out.println("reversed element");
                    stkObj.print();
                    break;
                default: System.out.println("You have entered the wrong choice");
                    return ;

            }

            System.out.println();
            System.out.println();

        }

    }
}

 