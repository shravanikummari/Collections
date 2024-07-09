package maintaininsertionorder;

import java.util.*;
public class OrderedElements {
private Set<String>elements;
public OrderedElements(){
    elements=new LinkedHashSet<>();
}
public void addElement(String element){
    elements.add(element);
}
public void displayElements(){
    for (String element:elements){
        System.out.println(element);
    }
}

    public static void main(String[] args) {
        OrderedElements ol=new OrderedElements();
        ol.addElement("apple");
        ol.addElement("ball");
        ol.addElement("cat");
        ol.addElement("anar");
        ol.addElement("bat");
        ol.addElement("elephant");
        System.out.println("Elements insertion order.");
        ol.displayElements();
}
}
