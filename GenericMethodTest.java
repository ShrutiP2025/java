// Person class for demonstration
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

// GenericMethod class with a generic method
class GenericMethod {

    // Generic method to display elements of an array
    public <T> void displayArrayElements(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
        System.out.println();
    }
}

// Driver Program
public class GenericMethodTest {

    public static void main(String[] args) {
        GenericMethod obj = new GenericMethod();
        Integer[] intArray = { 10, 20, 30, 40 };
        String[] strArray = { "java", "programming", "learning" };
        Person[] persons = {
                new Person("Nitin", "Pune"),
                new Person("Manoj", "Mumbai"),
                new Person("Mayur", "Delhi")
        };

        // Display Integer Array
        obj.displayArrayElements(intArray);

        // Display String Array
        obj.displayArrayElements(strArray);

        // Display Person Array
        obj.displayArrayElements(persons);
    }

}
