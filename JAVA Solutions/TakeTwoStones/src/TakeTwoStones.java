
public class TakeTwoStones {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int X = io.getInt();
		
		if(X%2==1)
			System.out.println("Alice");
		else
			System.out.println("Bob");
		
		io.close();
		
		System.exit(0);
	}

}
