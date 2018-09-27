
public class PointCounter {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		String input = io.getWord();
		int t = 0;
		int c = 0;
		int g = 0;
		int x = 0;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == 'T')
				t++;
			else if(input.charAt(i) == 'C')
				c++;
			else
				g++;
		}

		x = Math.min(Math.min(t, c), g);
		int answer = t*t + c*c + g*g + x*7;
		
		System.out.println(answer);
		io.close();
		System.exit(0);
	}

}
