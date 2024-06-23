//HashMap

import java.util.*;
 
public class HMap
{
    public static void main(String args[])
    {
    HashMap<Integer , String> hm = new HashMap<Integer,String>();
    Scanner sc = new Scanner(System.in);

    char ch;
    do
    {
        System.out.println("\t\t\tMENU");
        System.out.println("\t\t\t====");
        System.out.println("1. Put (create)");
        System.out.println("2. Remove (delete)");
        System.out.println("3. Get (read)");
        System.out.println("4. Display HashMap");
        System.out.println("5. Exit");
        System.out.println("Enter your choice : ");
        ch = sc.next().charAt(0);

        switch(ch)
        {
            case '1' :
            System.out.println("Enter key : ");
            int key = sc.nextInt();
            System.out.println("Enter value : ");
            String value = sc.next();
            hm.put(key,value);
            System.out.println("Entry added to hashmap ");
            break;

            case '2' :
            System.out.println("Enter key to remove : ");
            int rkey = sc.nextInt();
            if(hm.containsKey(rkey))
            {
                String rvalue = hm.remove(rkey);
                System.out.println("Removed entry with key " + rkey + " : "+ rvalue);
            }
            else
            {
                System.out.println("Key not found !!!");
            }
            break;
            
            case '3' :
            System.out.println("Enter to get key : ");
            int gkey = sc.nextInt();
            if(hm.containsKey(gkey))
            {
                System.out.println("Vlaue for key " + gkey + " : " + hm.get(gkey));
            }
            else
            {
                System.out.println("Key not found ! Please try try again...");
            }
            break;

            case '4':
            System.out.println("HAsMap entries : ");
            for(Map.Entry<Integer , String> entry : hm.entrySet())
            {
                System.out.println("Key : "+ entry.getKey() + " , value : " + entry.getValue());
            }
            break;
              
            case '5' :
            System.out.println("Exiting program...");
            break;

            default:
            System.out.println("Invalid choice !!!");
        }
    }while(ch != '5');
    sc.close();
}

}