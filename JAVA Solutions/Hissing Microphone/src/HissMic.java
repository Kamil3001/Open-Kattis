
public class HissMic {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		String word = io.getWord();
		String message = "no hiss";
		
		for(int i=1; i<word.length(); i++) {
			if(word.charAt(i-1) == 's' && word.charAt(i) == 's') {
				message = "hiss";
				break;
			}
		}
		
		System.out.println(message);
		io.close();
		System.exit(0);
	}

}
