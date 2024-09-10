import java.util.Arrays;

public class Mref3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a[] = {"GFG", "IDE", "Courses"};
        String b[] = {"gfg", "ide", "courses"};
        
        if (Arrays.equals(a, b, String::compareToIgnoreCase))
        {
             System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
	}

}
