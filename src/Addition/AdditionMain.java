package Addition;

public class AdditionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OBJECT 1 : passing arguments using setter
		Addition obj1 = new Addition();
		int setSumOfAddition = obj1.getSumOfTwo(10,20);
		System.out.println("Sum of two number using "+setSumOfAddition);
		
		
		//OBJECT 2: CONSTRUCTOR ARGS
		Addition obj2 = new Addition(150,45);
		int newSum = obj2.getSumOfTwo(obj2.num1, obj2.num2);
		System.out.println("Sum of two nums using constructo args: " + newSum);
	}
 
}
