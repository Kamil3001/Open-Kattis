import java.util.ArrayList;
import java.util.Arrays;

public class FoxNoises {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int T = io.getInt();
		String animal;
		String sound;
		String s;
		ArrayList<String> sounds;
		
		for(int i=0; i<T; i++) {
			s = io.nextLine();
			sounds = new ArrayList<String>(Arrays.asList(s.split(" ")));
			animal = io.getWord();
			while(!animal.equals("what")) {
				io.getWord();
				sound = io.getWord();
				while(sounds.contains(sound)) {
					sounds.remove(sound);
				}
				animal = io.getWord();
			}
			for(String a : sounds) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		
		io.close();
		System.exit(0);
	}

}
