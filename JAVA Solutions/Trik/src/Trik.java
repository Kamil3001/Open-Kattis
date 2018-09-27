
public class Trik {
	
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		String moves = io.getWord();
		int position = 1;
		
		for(int i=0; i<moves.length(); i++) {
			if(moves.charAt(i) == 'A') {
				if(position == 1)
					position = 2;
				else if(position == 2)
					position = 1;
			}
			else if(moves.charAt(i) == 'B') {
				if(position == 2)
					position = 3;
				else if(position == 3)
					position = 2;
			}
			else if(moves.charAt(i) == 'C') {
				if(position == 1)
					position = 3;
				else if(position == 3)
					position = 1;
			}
		}
		System.out.println(position);
		io.close();
		System.exit(0);
	}
}
