
public class MooseAge {
		public static void main(String[] args) {
			Kattio io = new Kattio(System.in, System.out);
			
			int l = io.getInt();
			int r = io.getInt();
			
			if(l == 0 && r == 0)
				System.out.println("Not a moose");
			else if(l == r)
				System.out.println("Even "+ (l+r));
			else if(l > r)
				System.out.println("Odd "+ (2*l));
			else
				System.out.println("Odd "+ (2*r));
			
			io.close();
			System.exit(0);
		}
}
