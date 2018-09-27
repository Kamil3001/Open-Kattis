
public class Oddities {

	public static void main(String[] args) {
		
		Kattio io = new Kattio(System.in, System.out);
		int x=io.getInt();
		while(io.hasMoreTokens()) {
			x = io.getInt();
			if(x%2 == 0)
				System.out.println(x + " is even");
			else
				System.out.println(x + " is odd");
		}
	
		io.close();
		System.exit(0);
	}
}
