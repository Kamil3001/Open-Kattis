
public class Bijele {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in,System.out);
		
		System.out.print((1-io.getInt())+" ");
		System.out.print((1-io.getInt())+" ");
		System.out.print((2-io.getInt())+" ");
		System.out.print((2-io.getInt())+" ");
		System.out.print((2-io.getInt())+" ");
		System.out.println((8-io.getInt()));
		
		
		io.close();
		System.exit(0);
	}

}
