
public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface2 ref;
		ref = (a, b) -> a + b;
		
		System.out.println("Sum: " + ref.addNumbers(4, 5));

	}

}

interface MyInterface2 {
	int addNumbers(int a, int b);
}