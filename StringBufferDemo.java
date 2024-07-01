// Program to demonstrate StringBuffer Class

public class StringBufferDemo {

    public static void main(String[] args) {
        
        // Thread Safe
        // String buffer is mutable
        
        StringBuffer obj = new StringBuffer("Hello");
        obj = obj.append(" World");
        
        StringBuffer obj1 = new StringBuffer("Hello");
        
        // Convert StringBuffer to String and then compare
        int val = obj.toString().compareTo(obj1.toString()); // compares two objects
        System.out.println(val); // prints value in integer
        
        obj.length();
        System.out.println(obj.charAt(2));
        System.out.println(obj);
    }
}
