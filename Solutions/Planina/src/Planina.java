
public class Planina {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		int n = io.getInt();
		int x = 2;
		
		for(int i = 1; i<=n; i++) {
			x = x+x-1;
		}
		System.out.println(x*x);
		
		io.close();
		System.exit(0);
	}

}
