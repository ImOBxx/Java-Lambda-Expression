import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

class GFG23
{
	static void printCond(Collection <Integer> C, Predicate <Integer> P)
	{
		for (Integer x : C)
		{
			if (P.test(x))
			{
				System.out.println(x + " ");
			}
		}
	}
}

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> al = new ArrayList<>(Arrays.asList(10, 5, 20, 7, 30));
		GFG23.printCond(al, x -> x % 2 == 0);
		

	}

}
