
public class SymmetricSet {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int N = io.getInt();
		int count = 1;
		int i;
		String[] names = new String[15];
		while(N != 0) {
			for(i=0; i<N/2; i++) {
				names[i] = io.getWord();
				names[N-i-1] = io.getWord();
			}
			if(N%2 != 0)
				names[i] = io.getWord();
			System.out.println("SET " + count);
			for(i=0; i<N; i++) {
				System.out.println(names[i]);
			}
			
			N = io.getInt();
			count++;
		}
		
		io.close();
		System.exit(0);
	}

}
