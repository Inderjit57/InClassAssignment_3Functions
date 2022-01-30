
public class GroceryList {

	int noOfItems;
	String nameOfItem;
	boolean isItemAvaliable;

	public GroceryList() {
		// TODO Auto-generated constructor stub
	}

	GroceryList(int noOfItems, String nameOfItem, boolean isItemAvaliable) {
		this.noOfItems = noOfItems;
		this.nameOfItem = nameOfItem;
		this.isItemAvaliable = isItemAvaliable;
	}

	String getItems(String nameOfItem) {
		this.nameOfItem = nameOfItem;

		return nameOfItem;
	}

	boolean isAvaliable(boolean isItemAvaliable) {
		this.isItemAvaliable = isItemAvaliable;
		return true;
	}

	int getItems(int noOfItems, String nameOfItem, boolean isItemAvaliable) {
		this.noOfItems = noOfItems;
		this.nameOfItem = nameOfItem;
		this.isItemAvaliable= isItemAvaliable;
		return 0;
	}
}
