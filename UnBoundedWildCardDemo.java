import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {

    public static void main(String[] args) {
		   int[] intArray = {1, 2, 3};
        List<int[]> intList = Arrays.asList(intArray);
        System.out.println("Display Integer values");
        // Display List of Integers
        UnBoundedWildCard.display(intList);

        List<String> strList = Arrays.asList("Hi", "Hello", "How are you");
        System.out.println("Display String values");
        // Display List of String
        UnBoundedWildCard.display(strList);

        Person persons[] = {new Person("Nitin", "Pune"), new Person("Manoj", "Mumbai"), new Person("Mayur", "Delhi")};
        List<Person> personList = Arrays.asList(persons);
        System.out.println("Display Person values");
        // Display List of Persons
        UnBoundedWildCard.display(personList);
    }
}

class UnBoundedWildCard {

    // Method to display elements of a List of any type using unbounded wildcards
    public static void display(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println();
    }
}

class Person {
    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
