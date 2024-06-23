import java.io.*;
import java.util.*;

class FileCSV
{
    public static final String FileName = "st_reuslt.csv" ;
    public static void main(String args[])
    {
        
        try
        {
            FileWriter fileW = new FileWriter(FileName,true);
            Scanner sc = new Scanner(System.in);
            boolean exit = false ;

            while(!exit)
            {
               System.out.println("Choose Operation : ");
				System.out.println("\n1] Add Record");
				System.out.println("\n2] Read");
				System.out.println("\n3] Update");
				System.out.println("\n4] Delete");
				System.out.println("\n5] Exit");
				System.out.println("\nEnter your choice : ");
				
                int ch = sc.nextInt();
                sc.nextLine(); //consume newline

                switch(ch)
                {
                    case 1:
                     CreateRecord(fileW, sc);
                     break;

                     default:
                     System.out.println("Invalid choice !!! please try again...");
                }

            }
            fileW.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    //adding record in file
    public static void CreateRecord(FileWriter fileW,Scanner sc)throws IOException
    {
        try
        {
            System.out.println("Enter Rollno : ");
            String rn = sc.nextLine();

            System.out.println("Enter your name : ");
            String name = sc.nextLine();

            System.out.println("enter the marks of subject 1 : ");
            double s1 = sc.nextDouble();

            System.out.println("enter the marks ok subject 2 : ");
            double s2 = sc.nextDouble();

            System.out.println("Enter thr mrks of subject 3 : ");
            double s3 = sc.nextDouble();

            double tm = s1 + s2 + s3 ;
            double pr = (tm/300)*100;
            String result = (pr >= 40)? "pass":"fail";

            String record = String.format("%s \t %s \t %.2f \t %.2f \t %.2f \t %.2f \t %%.2f \t %s \n",rn,name,s1,s2,s3,tm,pr,result);

                fileW.write(record);
                fileW.flush();
                fileW.close();
            System.out.println("Student record created successfully.");    
        }

        catch(Exception e)
        {
            System.out.println("Error creating student record : " + e.getMessage());
            e.printStackTrace();
        }
    }
}