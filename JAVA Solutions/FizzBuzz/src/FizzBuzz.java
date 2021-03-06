
public class FizzBuzz {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int x = io.getInt();
		int y = io.getInt();
		int n = io.getInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i % x == 0 && i % y == 0)
				System.out.println("FizzBuzz");
			else if(i % y == 0)
				System.out.println("Buzz");
			else if(i % x == 0)
				System.out.println("Fizz");
			else
				System.out.println(i);
		}
		
		io.close();
		System.exit(0);
	}

}
