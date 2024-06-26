package CartManagementSystem;

public class Item {
private int itemId;
private String description;
private double price;
private String title;


public Item(int itemId,String description,  double price, String title) {
	this.itemId=itemId;
	this.description=description;
	this.price=price;
	this.title=title;
	
	
}

public int getItemId() {
	return itemId;
}

public void setItemId(int itemId) {
	this.itemId = itemId;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}



@Override
public String toString() {
	return "Item [itemId=" + itemId + ", description=" + description + ", price=" + price + ", title=" + title
			+ "]";
}

}
