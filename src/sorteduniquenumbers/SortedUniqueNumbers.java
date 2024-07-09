package sorteduniquenumbers;
import java.util.*;
public class SortedUniqueNumbers {
   private Set<Integer> numbers;

   public SortedUniqueNumbers() {
      numbers = new TreeSet<>();
   }

   public void addnumber(int number) {
      numbers.add(number);
   }

   public void displayNumbers() {
      for (int number : numbers) ;
      System.out.println(numbers);
   }

   public static void main(String[] args) {
      SortedUniqueNumbers sortedUniqueNumbers=new SortedUniqueNumbers();
      sortedUniqueNumbers.addnumber(2);
      sortedUniqueNumbers.addnumber(5);
      sortedUniqueNumbers.addnumber(7);
      sortedUniqueNumbers.addnumber(1);
      sortedUniqueNumbers.addnumber(6);
      sortedUniqueNumbers.addnumber(4);
      sortedUniqueNumbers.addnumber(8);
      System.out.println("Unique numbers in sorted order");
      sortedUniqueNumbers.displayNumbers();

   }
}