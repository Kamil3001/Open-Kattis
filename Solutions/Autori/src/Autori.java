
public class Autori {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		String input = io.getWord();
		System.out.print(input.charAt(0));
		for(int i=1; i<input.length(); i++) {
			if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
				System.out.print(input.charAt(i));
		}
		
		io.close();
		System.exit(0);
	}

}
