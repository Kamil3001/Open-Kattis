
public class R2 {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		while(io.hasMoreTokens()) {
			System.out.println((-io.getInt() + 2*io.getInt()));
		}
		io.close();
		System.exit(0);
	}
}
