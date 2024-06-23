import java.io.*;
import java.util.*;

class FileCrudCSV
{
	public static final String FileName = "Student_Result.csv";
	
	public static void main(String args[])
	{
		try
		{
			FileWriter fileW = new FileWriter(FileName,true); //Append ModelMBean
			
			Scanner s = new Scanner(System.in);
			boolean exit = false;
			
			while(!exit)
			{
				System.out.println("Choose Operation : ");
				System.out.println("\n1] Add Record");
				System.out.println("\n2] Read");
				System.out.println("\n3] Update");
				System.out.println("\n4] Delete");
				System.out.println("\n5] Exit");
				System.out.println("\nEnter your choice : ");
				
				int choice = s.nextInt();
				s.nextLine(); //consume newline				
				
				switch(choice)
				{
					case 1:
						CreateRecord(fileW,s);
						break;
					
					case 2:
						ReadRecords();
						break;
						
					case 3:
						UpdateRecords(s);
						break;
						
					case 4:
						//DeleteRecords(s);
						break;	
					
					case 5:
						exit = true;
						break;
					
						
					default:
						System.out.println("Invalid choide, Please try again.");					
				}
			}
			
			fileW.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	//Adding records in file
	private static void CreateRecord(FileWriter fileW,Scanner s) throws IOException
	{
		try{
			
		System.out.println("Enter RollNo : ");
		String RollNo = s.nextLine();
		
		System.out.println("Enter Name : ");
		String Name = s.nextLine();
		
		System.out.println("Enter Marks for Subject 1 : ");
		double Sub1 = s.nextDouble();
		
		System.out.println("Enter Marks for Subject 2 : ");
		double Sub2 = s.nextDouble();
		
		System.out.println("Enter Marks for Subject 3 : ");
		double Sub3 = s.nextDouble();
		
		double TotalMarks = Sub1 + Sub2 + Sub3;
		
		double Percentage = (TotalMarks / 300)* 100;
		
		String Result = (Percentage >= 40 )? "Pass" : "Fail";
		
		//%s for string , 2f% for double 
		//fileW.write(String.format("%s \t %s \t %.2f\t %.2f\t %.2f\t %.2f\t %.2f%%\t %s \n",RollNo,Name,Sub1,Sub2,Sub3,TotalMarks,Percentage,Result));
		String record = String.format("%s \t %s \t %.2f\t %.2f\t %.2f\t %.2f\t %.2f%%\t %s \n",RollNo,Name,Sub1,Sub2,Sub3,TotalMarks,Percentage,Result);
		
			 fileW.write(record);
             fileW.flush();  
	         fileW.close();
		System.out.println("Student Record created successfully.");
		
	
	}	
	 catch (Exception e) {
        System.out.println("Error creating student record: " + e.getMessage());
        e.printStackTrace();
    }
}
//To read records from file
	private static void ReadRecords() throws IOException
	{
		try
		{
			System.out.println("Reading records from: " + FileName);
			BufferedReader r = new BufferedReader(new FileReader (FileName));
			String line;
			while ((line = r.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void UpdateRecords(Scanner s ) throws IOException
	{
		System.out.println("Enter Roll Number to update record : ");
		String RollNoToUpdate = s.nextLine();
		
		System.out.println("Enter Updated Marks for subject 1 : ");
		double UpdateSub1 = s.nextDouble();
		System.out.println("Enter Updated Marks for subject 2 : ");
		double UpdateSub2 = s.nextDouble();
		System.out.println("Enter Updated Marks for subject 3 : ");
		double UpdateSub3 = s.nextDouble();
		
		File tempFile = new File("Temp.csv");
		File InputFile = new File(FileName);
		
		try
		{
			BufferedReader r = new BufferedReader(new FileReader (InputFile));
			FileWriter W  = new FileWriter(tempFile);
			
			
			String line;
			
			while ((line = r.readLine()) != null)
			{
				String[] fields = line.split("\t");
				
				if(fields.length >= 4 && fields[0].trim().equals(RollNoToUpdate))
				{
					double TotalMarks = UpdateSub1 + UpdateSub2 + UpdateSub3;
					
					double Percentage = (TotalMarks / 300) * 100;
					
					String Result = (Percentage >= 40 )? "Pass ":"Fail";
					
					line = String.format("%s \t%s\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f%%\ts \n",fields[0],fields[1], UpdateSub1,UpdateSub2,UpdateSub3 , TotalMarks ,Percentage ,Result);
				}
				W.write(line + "\n");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		if(!InputFile.delete())
		{
			System.out.println("Failed to delete the original File.");
			return;
		}
		if(!tempFile.renameTo(InputFile))
		{
			System.out.println("Failed to rename the temp file .");
		}
		System.out.println("Record updated Successfully.");
	}

    // private static DeleteRecords() throws IOException
    // {

    // }
}