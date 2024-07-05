package grocerylistapplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GroceryListApp {
    List<String> groceryList;

    public GroceryListApp() {
        this.groceryList = new ArrayList<>();
    }

    public void addItem(String item) {
        groceryList.add(item);
        System.out.println(item + "added to the grocerylist");
    }

    public void removeItem(String item) {
        if (groceryList.remove(item)) {
            System.out.println(item + " removed from the grocery list.");
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }

    public void displayItems() {
        if (groceryList.isEmpty()) {
            System.out.println("grocery list is empty");
        } else {
            System.out.println("grocery list");
            for (String item : groceryList) {
                System.out.println("*" + item);
            }
        }
    }

    public static void main(String[] args) {
        GroceryListApp groceryListApp = new GroceryListApp();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\nGrocery List Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Items");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String addItem = scanner.nextLine();
                    groceryListApp.addItem(addItem);
                    break;
                case 2:
                    System.out.print("Enter item to remove: ");
                    String removeItem = scanner.nextLine();
                    groceryListApp.removeItem(removeItem);
                    break;
                case 3:
                    groceryListApp.displayItems();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        scanner.close();
    }
}
