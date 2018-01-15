
public class Filip {

	public static int reverse(int a) {
		int reversed =0;
		while(a != 0) {
			reversed = reversed*10 + a%10;
			a/=10;
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		
		Kattio io = new Kattio(System.in, System.out);
		
		int a = reverse(io.getInt());
		int b = reverse(io.getInt());
		
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
		
		io.close();
		System.exit(0);
	}
}
