package collections;
import java.util.ArrayList;
import java.util.LinkedList;
public class Makeup {
    public static void main(String[] args) {
        ArrayList<String> productname=new ArrayList<>();
        productname.add(2,"powder");
        productname.add(0,"sunscreen");
        productname.add(1,"conceler");
        productname.add(3,"foundation");
        System.out.println(productname);
        LinkedList<String>products=new LinkedList<>();
        products.add("nail polish");
        products.add("lipstick");
        products.add("maskara");
        productname.addAll(products);
        System.out.println(productname);
    }
}
