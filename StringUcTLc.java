import java.util.Arrays;
import java.util.List;

public class StringUcTLc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> sl = Arrays.asList("Red", "Green", "Blue", "PINK");
		
		System.out.println("Original String: ");
		for (String str : sl) {
			System.out.println(str);
		}
		
		sl.replaceAll(str -> str.toLowerCase());
		
		System.out.println("\nLowercase Strings: ");
		for (String str : sl)
		{
			System.out.println(str);
		}
		
        sl.replaceAll(str -> str.toUpperCase());
		
		System.out.println("\nUppercase Strings: ");
		for (String str : sl)
		{
			System.out.println(str);
		}
		
		
		

	}

}
