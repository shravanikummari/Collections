package performanceandorder;
import java.util.*;
public class SetComparison {
    public Set<Integer>hashSet;
    private Set<Integer>treeSet;
    public SetComparison(){
        hashSet=new HashSet<>();
        treeSet=new TreeSet<>();
    }
    public void addElements(Set<Integer> set,int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {

            set.add((int) (Math.random() * numberOfElements));
        }
    }
    public void displaySet(Set<Integer> set) {
        for (Integer element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void comparePerformance() {
        int numberOfElements = 100;

        // Measure time for adding elements to HashSet
        long startTime = System.nanoTime();
        addElements(hashSet, numberOfElements);
        long endTime = System.nanoTime();
        long hashSetTime = endTime - startTime;

        // Measure time for adding elements to TreeSet
        startTime = System.nanoTime();
        addElements(treeSet, numberOfElements);
        endTime = System.nanoTime();
        long treeSetTime = endTime - startTime;

        // Display results
        System.out.println("HashSet time: " + hashSetTime + " ns");
        System.out.println("TreeSet time: " + treeSetTime + " ns");

        // Display elements
        System.out.println("HashSet elements:");
        displaySet(hashSet);
        System.out.println("TreeSet elements:");
        displaySet(treeSet);
    }

    public static void main(String[] args) {
        SetComparison comparison = new SetComparison();
        comparison.comparePerformance();
    }
}