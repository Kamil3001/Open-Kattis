
public class Tarifa {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);

		int X = io.getInt();
		int N = io.getInt();
		int total = X*(N+1);
		
		while(N>0)
		{
			total -= io.getInt();
			N--;
		}
		
		System.out.println(total);
		
		io.close();
		
		System.exit(0);
	}
}
