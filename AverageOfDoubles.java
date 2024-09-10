import java.util.Arrays;
import java.util.List;

public class AverageOfDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Double> n = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
		System.out.println("Original Value: " + n);
		double sum = 0.0;
		for (double ns : n)
		{
			sum = sum + ns;
		}
		
		double avg = n.isEmpty() ? 0.0 : sum / n.size();
		
		System.out.println("\nAverage of the original value: " + avg);
		

	}

}
