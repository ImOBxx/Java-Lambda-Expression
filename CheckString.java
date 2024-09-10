import java.util.function.Predicate;

public class CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate <String> isEmptyString = str -> str.isEmpty();
		String s1 = "";
		String s2 = "Java lambda expression!";
		
		System.out.println("String 1: " + s1);
		System.out.println("String 1 is Empty: " + isEmptyString.test(s1));
		System.out.println("String 2: " + s2);
		System.out.println("String 2 is Empty: " + isEmptyString.test(s2));
		
		
		

	}

}
