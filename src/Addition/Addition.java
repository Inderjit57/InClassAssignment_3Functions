package Addition;

public class Addition {

	int num1;
	int num2;

	String name1;
	String name2;
	String name3;

	// CONSTRUCTOR FOR ADDITION
	Addition() {
		System.out.println("This is Cunstructor of Addition");
	}

	Addition(int number1, int number2) {
		num1 = number1;
		num2 = number2;
	}

	int getSumOfTwo(int number1, int number2) {
		num1 = number1;
		num2 = number2;
		return num1 + num2;
	}

}
