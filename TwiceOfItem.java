import java.util.ArrayList;

public class TwiceOfItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++)
		{
			arr.add(i + 1);
		}
		
		arr.forEach((item) -> System.out.println(item * 2));

	}

}
