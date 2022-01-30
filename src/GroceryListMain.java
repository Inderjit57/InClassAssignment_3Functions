
public class GroceryListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GroceryList obj1 = new GroceryList();
		String newItemName = obj1.getItems("Tomato");
		System.out.println("Item in list " + newItemName);

		GroceryList obj2 = new GroceryList(50, "watermelon", false);
		int setItems = obj2.getItems(obj2.noOfItems, obj2.nameOfItem, obj2.isItemAvaliable);
		System.out.println("all items: " + setItems);

		GroceryList obj3 = new GroceryList();
		boolean isItAvaliable = obj3.isAvaliable(obj3.isItemAvaliable);
		System.out.println("Update if item avaliable: " + isItAvaliable);

	}
}
