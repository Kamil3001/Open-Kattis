
public class Faktor {
	
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		System.out.println(io.getInt() * (io.getInt()-1) + 1);
		io.close();
		System.exit(0);
	}
}
