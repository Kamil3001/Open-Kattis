
public class NastyHacks {

	public static void main(String[] args) {
		
		Kattio io = new Kattio(System.in, System.out);
		io.getInt();
		
		while(io.hasMoreTokens()) {
			int r = io.getInt();
			int e = io.getInt();
			int c = io.getInt();
			
			if(e-c > r) {
				System.out.println("advertise");
			}
			else if(e-c < r) {
				System.out.println("do not advertise");
			}
			else {
				System.out.println("does not matter");
			}
		}
		
		io.close();
		System.exit(0);
	}

}
