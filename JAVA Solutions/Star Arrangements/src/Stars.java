
public class Stars {
	
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int S = io.getInt();
		int limit;
		
		//setting the highest number of stars
		if(S % 2 == 0)
			limit = S/2;
		else
			limit = S/2 + 1;
		
		System.out.println(S + ":");
		
		
		for(int i = 2; i <= limit; i++) {
			for(int j = i-1; j <= i; j++) {
				if(S % (i+j) == 0) {
					System.out.println(i + "," + j);
				}
				else if((S-i) % (i+j) == 0) {
					System.out.println(i + "," + j);
				}
			}
		}
		
		io.close();
		System.exit(0);
	}
}
