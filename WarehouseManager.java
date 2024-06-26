package CartManagementSystem;

import java.util.Scanner;

public class WarehouseManager {
private static Warehouse warehouse=new Warehouse();
private static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	
	while(true) {
		System.out.println("Warehouse Management System");
		System.out.println("1, Add Item");
		System.out.println("2. Display Items");
		System.out.println("3. Update Item");
		System.out.println("4. Delete Item");
		System.out.println("5. Check Item Quantity");
		System.out.println("6. Exit");
		  System.out.print("Enter your choice: ");
          int choice = sc.nextInt();
          sc.nextLine();
          
          switch (choice) {
          case 1:
              addItem();
              break;
          case 2:
              warehouse.displayItems();
              break;
          case 3:
              updateItem();
              break;
          case 4:
              deleteItem();
              break;
          case 5:
              checkItemQuantity();
              break;
          case 6:
              System.out.println("Exiting...");
              return;
          default:
              System.out.println("Invalid choice. Please try again.");
      }
	}
	
	
} private static void addItem() {
    System.out.print("Enter Item ID: ");
    int itemId = sc.nextInt();
    sc.nextLine();  
    System.out.print("Enter Item Title: ");
    String title = sc.nextLine();
    System.out.print("Enter Item Price: ");
    double price = sc.nextDouble();
    sc.nextLine();  
    System.out.print("Enter Item Description: ");
    String description = sc.nextLine();
    System.out.print("Enter Item Quantity: ");
    int quantity = sc.nextInt();
    sc.nextLine();

    Item item = new Item(itemId, description, price, title);
    warehouse.addItem(item, quantity);
}
private static void updateItem() {
    System.out.print("Enter Item ID to update: ");
    int itemId = sc.nextInt();
    sc.nextLine();  
    System.out.print("Enter new Title: ");
    String title = sc.nextLine();
    System.out.print("Enter new Price: ");
    double price = sc.nextDouble();
    sc.nextLine();  
    System.out.print("Enter new Description: ");
    String description = sc.nextLine();
    System.out.print("Enter new Quantity: ");
    int quantity = sc.nextInt();
    sc.nextLine();  

    warehouse.updateItem(itemId, title, price, description, quantity);
}
private static void deleteItem() {
    System.out.print("Enter Item ID to delete: ");
    int itemId = sc.nextInt();
    sc.nextLine();  
    warehouse.deleteItem(itemId);
}
private static void checkItemQuantity() {
    System.out.print("Enter Item ID to check quantity: ");
    int itemId = sc.nextInt();
    sc.nextLine();  
    warehouse.checkItemQuantity(itemId);
}
}
