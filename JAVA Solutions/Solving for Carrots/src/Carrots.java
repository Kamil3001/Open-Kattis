
public class Carrots {
	
	public static void main(String[] args) {
		
		Kattio io = new Kattio(System.in, System.out);
		
		io.getInt();
		System.out.println(io.getInt());
		io.close();
		System.exit(0);
	}
}
