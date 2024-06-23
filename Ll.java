import java.util.LinkedList;
import java.util.Scanner;

public class Ll
{
    public static void main(String args[])
    {
        LinkedList<String> li = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        char choice;

        do
        {
            System.out.println("\t\t\t Menu ");
            System.out.println("\t\t\t ==== ");
            System.out.println("1. Add (create)");
            System.out.println("2. Remove");
            System.out.println("3. Show");
            System.out.println("4. Display all");
            System.out.println("5. Exit");
            System.out.println("        ");
            System.out.println("Please enter your choice : ");
            choice = sc.next().charAt(0);
            switch(choice) 
            {
                case '1':
                System.out.println("Enter element : ");
                String el = sc.next();
                li.add(el);
                System.out.println("element "+el + " is inserted into linkedlist successfully.");
                break;
            
                case '2':
                System.out.println("Enter index value of element : ");
                int index = sc.nextInt();
                if(index >= 0 && index < li.size())
                {
                    String rel = li.remove(index);
                    System.out.println("Remove element at index "+ index + " : "+ rel);
                } 
                else
                {
                    System.out.println("Invalid choice");
                }
                break;

                case '3':
                System.out.println("Enter index value of elemnet you want to show : ");
                int dis = sc.nextInt();
                if(dis >= 0 && dis < li.size())
                {
                    System.out.println("Element at index "+ dis + " : "+li.get(dis));
                }
                else
                {
                    System.out.println("Invalid choice !!");
                }
                break;

                case '4':
                System.out.println("Linkedlist element : ");
                for(String disall : li)
                {
                    System.out.println(disall);
                }
                break;

                case '5':
                System.out.println("program exiting....");
                System.exit(0);
                break;

                default:
                System.out.println("invalid choice !!! Please try again.");
                    break;
            }
            
            
        }while(choice != '5');

    }
}