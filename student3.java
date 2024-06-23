/*
Test nested exception by putting exception handling mechanism in the above method and also in main
method.
*/

public class student3
 {
    private int id;
    private String name;
    private int age;

    public student3(int id, String name, int age) throws AgeException
    {
        this.id = id;
        this.name = name;
        if (age < 20) {
            throw new AgeException("Age must be greater than or equal to 20.");
        }
        this.age = age;
    }

    public static class AgeException extends Exception {
        public AgeException(String message) {
            super(message);
        }
    }

    public static int getAge() throws AgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        if (age < 20) {
            throw new AgeException("Age must be greater than or equal to 20.");
        }
        return age;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            System.out.print("Enter name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            int age = getAge();

            student3 student3 = new student3(id, name, age);
            System.out.println("student3 created with id: " + student3.getId() + ", name: " + student3.getName() + ", and age: " + student3.getAge());
        } 
        catch (AgeException e) 
        {
            System.out.println(e.getMessage());
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid input. Please enter a valid age.");
        } 
        catch (Exception e)
        {
            System.out.println("An error occurred while creating the student3.");
            e.printStackTrace();
        }
    }
}