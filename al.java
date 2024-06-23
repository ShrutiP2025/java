import java.util.ArrayList;
import java.util.Scanner;

public class al
{
    public static void main(String args[])
    {
        ArrayList<String> ali = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        char choice;
        do
        {
            System.out.println("\t\t\t menu");
            System.out.println("1.ADD");
            System.out.println("2.Remove(Delete)");
            System.out.println("3.Get(Read)");
            System.out.println("4.Display Arraylist");
            System.out.println("5.Exit");
            System.out.println("Please enter your choice : ");
            choice = sc.next().charAt(0);

            switch(choice)
            {
             case '1':
                System.out.println("Enter element : ");
                String el =sc.next();
                ali.add(el);
                System.out.println("Elemnt " + el + " added to arraylist. ");
                break;

             case '2':
                System.out.println("Enter index to remove element : ");
                int index = sc.nextInt();
                if(index >= 0 && index < ali.size())
                {
                    String removeel = ali.remove(index);
                    System.out.println("remove element at index "+ index +" : "+ removeel );
                } 
                else
                {
                    System.out.println("invalid index !!!");
                }
                break;

             case '3':
                System.out.println("Enter index to get element : ");
                int geti = sc.nextInt();
                if(geti >=0 && geti < ali.size())
                {
                    System.out.println("Element at index " + geti + " : "+ ali.get(geti));
                }
                else
                {
                    System.out.println("Invalid index !!! ");
                }
                break;

             case '4':
                System.out.println("ArrayList elements : ");
                for(String item : ali)
                {
                    System.out.println(item);
                }
                break;
            
             case '5':
                System.out.println("exiting program....");
                System.exit(0);
                break;
                
             default:
                System.out.println("Invalid choice! Please try again.");
            }
        }while(choice != '5');
        sc.close();
    }
}