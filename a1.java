/*
Write a program which will handle the ArrayIndexOutOfBoundsException and
DivideByZeroException with multiple catch and finally block.
*/

public class a1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int denominator = 0;

        try 
        {
            System.out.println("Accessing array element at index 5: " + arr[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("array is out of bound");
        }

        try 
        {
            System.out.println("Dividing by zero: " + 10 / denominator);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Can't divided by zero " );
        }

        try 
        {
            System.out.println("Accessing array element at index 5 again: " + arr[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        finally 
        {
            System.out.println("Finally block executed.");
        }
    }
}
/*
array is out of bound
Can't divided by zero 
Caught ArrayIndexOutOfBoundsException: 5
Finally block executed.
 */