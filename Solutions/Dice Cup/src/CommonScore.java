
public class CommonScore {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		int N = io.getInt();
		int M = io.getInt();
		
		if(M>N) {
			int temp = M;
			M = N;
			N = temp;
		}
		
		for(int i=1; i<=N-M+1; i++) {
			System.out.println(i+M);
		}
		
		io.close();
		System.exit(0);
	}

}
