
public class ReverseBinary {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int num = io.getInt();
		String s = "";
		
		while(num != 0) {
			s += num%2;
			num /= 2;
		}
		System.out.println(Integer.parseInt(s, 2));
		
		io.close();
		System.exit(0);
	}

}
