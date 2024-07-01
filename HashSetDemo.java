import java.util.*;

public class HashSetDemo {

    static void addElements(HashSet<Integer> numberHashSet) {
        numberHashSet.add(61);
        numberHashSet.add(41);
        numberHashSet.add(91);
        numberHashSet.add(51);
        numberHashSet.add(80);
        numberHashSet.add(11);
        numberHashSet.add(20);
        System.out.println(numberHashSet.add(51)); // returns false - does not allow duplicate elements
    }

    public static void main(String[] args) {
        // Unordered and unsorted set
        HashSet<Integer> numberHashSet = new HashSet<Integer>();
        addElements(numberHashSet);

        HashSet<Integer> numberHashSet1 = new HashSet<Integer>();
        numberHashSet1.add(20);
        numberHashSet1.add(80);
        numberHashSet1.add(11);
        numberHashSet1.add(50);
        numberHashSet1.add(60);
        numberHashSet1.add(10);
        numberHashSet1.add(51);

        System.out.println("Set 1: " + numberHashSet);
        System.out.println("Set 2: " + numberHashSet1);

        HashSet<Integer> numberHashSet2 = new HashSet<Integer>();
        addElements(numberHashSet2);

        // Union of two sets
        HashSet<Integer> unionSet = new HashSet<>(numberHashSet);
        unionSet.addAll(numberHashSet1);
        System.out.println("Union Set : " + unionSet);

        // Intersection of two sets
        HashSet<Integer> intersectionSet = new HashSet<>(numberHashSet);
        intersectionSet.retainAll(numberHashSet1);
        System.out.println("Intersection Set : " + intersectionSet);

        // Set difference
        HashSet<Integer> differenceSet = new HashSet<>(numberHashSet);
        differenceSet.removeAll(numberHashSet1);
        System.out.println("Set Difference : " + differenceSet);

        // Spliterator
        Spliterator<Integer> split = numberHashSet.spliterator();
        split.forEachRemaining(System.out::println);
    }
}
