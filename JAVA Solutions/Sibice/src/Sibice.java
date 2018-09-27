
public class Sibice {

	public static void main(String[] args) {
		
		Kattio io = new Kattio(System.in, System.out);
		io.getInt();
		int w = io.getInt();
		int h = io.getInt();
		
		int max = (int) Math.sqrt(w*w + h*h);
		
		while(io.hasMoreTokens())
		{
			if(io.getInt() <= max)
				System.out.println("DA");
			else
				System.out.println("NE");
		}
		io.close();
		System.exit(0);
	}
}
