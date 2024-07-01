

public class StringClassDemo {

	public static void main(String[] args) {
		
		 //Is string mutable or Immutable? - Immutable

//it can store the value in the reference variable but the object will be stored in heap memory after the existing object and the address of the new object will be stored in the existing reference object 
		
		String str = new String("Hello");
		System.out.println(str);

		str ="World";
		System.out.println(str);
	}

}