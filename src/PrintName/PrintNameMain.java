package PrintName;

public class PrintNameMain {

	public static void main(String[] args) {
		
		//OBJECT 1 : passing arguments using setter
		PrintName obj1 = new PrintName();
		String setNewName = obj1.getName("inder ", " this is just to Print ", " Singh");
		System.out.println("Names for Object1 are: " + setNewName);
		
		
		//OBJECT 2: CONSTRUCTOR ARGS
		PrintName obj2 = new PrintName("Birds ", "animals ", "fish");
		String newName = obj2.getName(obj2.name1, obj2.name2, obj2.name3);
		System.out.println("Names for Object2 are: "+newName);
	}

}
