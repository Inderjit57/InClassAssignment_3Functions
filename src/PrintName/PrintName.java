package PrintName;

public class PrintName {

	String name1;
	String name2;
	String name3;

	PrintName() {

	}

	PrintName(String nam1, String nam2, String nam3) {
		name1 = nam1;
		name2 = nam2;
		name3 = nam3;
	}

	String getName(String name1, String name2, String name3) {
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		String allNames = name1 + name2 + name3;
		return allNames;
	}

}
