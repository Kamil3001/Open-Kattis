
public class Pot {
	
	public static void main(String[] args) {
		
		Kattio io = new Kattio(System.in, System.out);
		
		io.getInt();
		int sum = 0;
		int p;
		while(io.hasMoreTokens()) {
			p = io.getInt();
			sum += (int) Math.pow(p/10, p%10);
		}
		System.out.println(sum);
		io.close();
		System.exit(0);
	}
}
