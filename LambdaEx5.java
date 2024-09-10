
interface Test12
{
	void print();
}

public class LambdaEx5 {
	
	static void fun (Test12 t)
	{
		t.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(() -> System.out.println("Hello"));

	}
}
