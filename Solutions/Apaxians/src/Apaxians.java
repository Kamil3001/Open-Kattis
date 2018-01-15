
public class Apaxians {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		String input = io.getWord();
		String output = "" + input.charAt(0);
		char temp = input.charAt(0);
		
		for(int i=1; i<input.length(); i++) {
			char x = input.charAt(i);
			if(x != temp) {
				output += x;
				temp = x;
			}
		}
		System.out.println(output);
		
		io.close();
		System.exit(0);
	}

}
