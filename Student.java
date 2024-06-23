/*
For the s1class (id,name,age), write a program to raise an user define exception for the age less
than 20 years.
*/
public class Student 
{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) throws Exception
    {
        this.id = id;
        this.name = name;
        if (age < 20) 
        {
            throw new Exception("Age must be greater than or equal to 20.");
        }
        this.age = age;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public static class Ex extends Exception 
    {
        public Ex(String message)
         {
            super(message);
        }
    }

    public static void main(String[] args) 
    {
        try 
        {
            Student s1 = new Student(1, "abc", 19);
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }

        try
        {
            Student s2 = new Student(2, "xyz", 25);
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}

/*
 o/p:
 Age must be greater than or equal to 20.
 */