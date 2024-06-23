import java.util.Stack;
import java.util.Scanner;

public class st
{
    public static void main(String args[])
    {
        Stack<String> str = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        char ch;
        
        do
        {
            System.out.println("\t\t\t Menu ");
            System.out.println("\t\t\t ==== ");
            System.out.println("1. ADD (Push)");
            System.out.println("2. Remove (Pop)");
            System.out.println("3. Get (Peek)");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.println("Please enter your choice : ");
            ch = sc.next().charAt(0);

            switch (ch)
            {
                case '1':
                System.out.println("Enter element to push : ");
                String el = sc.next();
                str.push(el);    
                System.out.println("Element "+ el +" pushed onto the stack.");
                break;
                
                case '2':
                if(!str.isEmpty())
                {
                    System.out.println("Popped element : "+str.pop());
                }
                else
                {
                    System.out.println("Stack is empty. Cannot pop.");
                }
                break;

                case '3':
                if(!str.isEmpty())
                {
                    System.out.println("Top element : "+str.peek());
                }
                else
                {
                    System.out.println("Stack is empty. No top element.");
                }
                break;

                case '4':
                if(!str.isEmpty())
                {
                    System.out.println("Stack elements : ");
                    for(String item : str)
                    {
                        System.out.println(item);
                    }
                }   
                else
                {
                    System.out.println("Stack is empty.");
                }
                break;

                case '5':
                System.out.println("exiting program....");
                System.exit(0);
                break;
                
                default:
                break;
            }
        }while(ch != '5');
        sc.close();
    }    
}