import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jeremypitt on 9/6/16.
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<InventoryItem> items = new ArrayList<>();

    public static void main(String[] args) {


        while (true) {
            int i = 1;
            System.out.println("Item List:");
            for (InventoryItem item : items) {
                System.out.println(i + ". " + item.name + ", " + item.quantity);
                i++;
            }
            System.out.println("---");
            System.out.println("1. Enter a new item.");
            System.out.println("2. Remove an item.");
            System.out.println("3. Update an item's quantity.");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    newItem();
                    break;
                case "2":
                    removeItem();
                    break;
                case "3":
                    updateItem();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public static void newItem() {
        System.out.println("Enter the name of the item:");
        String itemName = scanner.nextLine();
//        System.out.println("Enter the quantity of the item:");
//        int itemQuantity = Integer.valueOf(scanner.nextLine());
        InventoryItem item = new InventoryItem(itemName);
        items.add(item);
    }

    public static void removeItem() {
        System.out.println("Enter the number of the item you wish to remove:");
        int itemNum = Integer.valueOf(scanner.nextLine());
        items.remove(itemNum - 1);

    }

    public static void updateItem(){
        System.out.println("Enter the number of the item you wish to update:");
        int itemNum = Integer.valueOf(scanner.nextLine());

            InventoryItem item = items.get(itemNum - 1);
//        String updateName = items[itemNum - 1];
//        int itemNum = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter the quantity of the item:");
            int itemQuantity = Integer.valueOf(scanner.nextLine());
            item.quantity = itemQuantity;

    }


}
