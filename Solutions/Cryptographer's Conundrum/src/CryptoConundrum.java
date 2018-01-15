
public class CryptoConundrum {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		String cipher = io.getWord();
		int count=0;
		
		for(int i=0; i<cipher.length(); i++) {
			if(i%3 == 0 && cipher.charAt(i) != 'P')
				count++;
			else if(i%3 == 1 && cipher.charAt(i) != 'E')
				count++;
			else if(i%3 == 2 && cipher.charAt(i) != 'R')
				count++;
		}
		
		System.out.println(count);
		io.close();
		System.exit(0);
	}

}
