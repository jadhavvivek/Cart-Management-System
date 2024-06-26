package CartManagementSystem;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
public class Warehouse {
private List<Item> items;
private Map<Integer, Integer> itemQuantities;
public Warehouse() {
	this.items=new ArrayList<>();
	this.itemQuantities=new HashMap<>();
}
public void addItem(Item item, int quantity) {
	items.add(item);
	itemQuantities.put(item.getItemId(), quantity);
	System.out.println("Item added successfully!");
}
public void displayItems() {
	if(items.isEmpty()) {
		System.out.println("No items in the warehouse.");
	}else {
		for(Item item:items) {
			System.out.println(item+", Quantity:"+itemQuantities.get(item.getItemId()));
		}
	}
}

public void updateItem(int itemId, String title, double price, String description, int quantity) {
	Item item=findItemById(itemId);
	
	if(item != null) {
		item.setTitle(title);
		item.setPrice(price);
		item.setDescription(description);
		itemQuantities.put(itemId, quantity);
		System.out.println("Item updated successfully!");
		
	}else {
		System.out.println("Item not found.");
	}
}
public void deleteItem(int itemId) {
	Item item=findItemById(itemId);
	
	if(item !=null) {
		items.remove(item);
		itemQuantities.remove(itemId);
		System.out.println("Item deleted successfully!");
	}else {
		System.out.println("Item not found.");
	}
}

public void checkItemQuantity(int itemId) {
	Item item=findItemById(itemId);
	
	if(item !=null) {
		System.out.println("Item Quantity: "+itemQuantities.get(itemId));
	}else {
		System.out.println("Item not found.");
	}
}
private Item findItemById(int itemId) {
	for(Item item: items) {
		if(item.getItemId()==itemId) {
			return item;
		}
	}
	return null;
}
}


