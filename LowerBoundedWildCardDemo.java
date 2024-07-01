import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCardDemo {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        intList.add(4); // This works fine now
        
        System.out.println("Display Integer values");
        LowerBoundedWildCardDemo.displayNumbers(intList);

        List<Number> numberList = new ArrayList<Number>(Arrays.asList(1.0, 2.0, 3.0, 10, 4, 30));
        System.out.println("Display Number values");
        LowerBoundedWildCardDemo.displayNumbers(numberList);

        // Uncommenting this section will cause an error
        /*
         * List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0);
         * System.out.println("Display Double values");
         * LowerBoundedWildCardDemo.displayNumbers(doubleList);
         */
    }

    // Sample method to display elements of a List<? extends Number>
    public static void displayNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
