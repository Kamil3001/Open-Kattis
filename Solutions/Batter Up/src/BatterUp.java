
public class BatterUp {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		int n = io.getInt();
		int sum = 0;
		while(io.hasMoreTokens()) {
			int at_bat = io.getInt();
			if(at_bat < 0)
				n--;
			else
				sum += at_bat;
		}
		
		System.out.println(sum/(n*1.0));
		io.close();
		System.exit(0);
	}

}
