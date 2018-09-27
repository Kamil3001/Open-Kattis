
public class QuadSelect {
	
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		while(io.hasMoreTokens()) {
			if(io.getInt() > 0) {
				if(io.getInt() > 0)
					System.out.println(1);
				else
					System.out.println(4);
			}
			else {
				if(io.getInt() > 0)
					System.out.println(2);
				else
					System.out.println(3);
			}
		}
		
		io.close();
		System.exit(0);
	}
}
