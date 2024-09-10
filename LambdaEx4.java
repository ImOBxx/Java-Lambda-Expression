
interface Test1
{
	void print();
}

interface Test2
{
	void print(Integer P);
}

interface Test3
{
	void print(Integer P1, Integer P2);
}


public class LambdaEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Test1 t1 = () -> System.out.println("Hello");
	        t1.print();  // Invoking the lambda

	        // Lambda for Test2
	        Test2 t2 = p -> System.out.println(p);
	        t2.print(10);  // Invoking the lambda with an integer

	        // Lambda for Test3
	        Test3 t3 = (p1, p2) -> System.out.println(p1 + " " + p2);
	        t3.print(20, 30);  // Invoking the lambda with two integers
		
	}

}
