
public class Bela {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		int n = 4 * io.getInt();
		char domSuit = io.getWord().charAt(0);
		int sum = 0;
		
		while(n!=0) {
			String s = io.getWord();
			if(s.charAt(0) == 'A') {
				sum += 11;
			}
			else if(s.charAt(0) == 'K') {
				sum += 4;
			}
			else if(s.charAt(0) == 'Q') {
				sum += 3;
			}
			else if(s.charAt(0) == 'J') {
				if(s.charAt(1) == domSuit) {
					sum += 20;
				}
				else {
					sum += 2;
				}
			}
			else if(s.charAt(0) == 'T') {
				sum += 10;
			}
			else if(s.charAt(0) == '9') {
				if(s.charAt(1) == domSuit) {
					sum += 14;
				}
			}
			n--;
		}
		
		System.out.println(sum);
		io.close();
		System.exit(0);
	}

}
