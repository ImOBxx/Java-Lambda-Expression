
interface SumCalc {
	int sum(int a, int b);
}

public class LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumCalc sumcalc = (x, y) -> x + y;
		int res = sumcalc.sum(7,  6);
		System.out.println("Sum 7, 6): " + res);
		res = sumcalc.sum(15,  -35);
		System.out.println("Sum 15, -35): " + res);
		
		

	}

}
