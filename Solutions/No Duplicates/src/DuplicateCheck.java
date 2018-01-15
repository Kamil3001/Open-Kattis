import java.util.ArrayList;

public class DuplicateCheck {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		ArrayList<String> words = new ArrayList<String>();
		words.add(io.getWord());
		
		while(io.hasMoreTokens()) {
			String nxtWord = io.getWord();
			for(int i=0; i<words.size(); i++) {
				if(words.get(i).equals(nxtWord)) {
					System.out.println("no");
					io.close();
					return;
				}
			}
			words.add(nxtWord);
		}
		
		System.out.println("yes");
		io.close();
		System.exit(0);
	}
}
