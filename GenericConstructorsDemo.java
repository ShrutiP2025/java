// GenericConstructors class with generic constructor
class GenericConstructors<T> {
    private T value;

    public GenericConstructors(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println("Value: " + value);
    }
}

// Driver Program
public class GenericConstructorsDemo {

    public static void main(String[] args) {
        System.out.println("Number to Double Conversion:");

        // Using Integer type
        GenericConstructors<Integer> obj = new GenericConstructors<Integer>(10);
        obj.show();

        // Using Float type
        GenericConstructors<Float> objOne = new GenericConstructors<Float>(136.8F);
        objOne.show();

        // This will not compile because "Hello" is a String and GenericConstructors<T>
        // expects a type T that matches the constructor argument type.
        // GenericConstructors<String> objTwo = new GenericConstructors<>("Hello");
        // objTwo.show();
    }

}
