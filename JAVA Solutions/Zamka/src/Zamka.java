
public class Zamka {

	public static int digitSum(int a) {
		int sum = 0;
		
		while(a != 0) {
			sum += a%10;
			a/=10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
	
		int L = io.getInt();
		int D = io.getInt();
		int X = io.getInt();
		int N=0, M=0;
		
		for(int i = L; i<=D; i++) {
			if(digitSum(i) == X) {
				N = i;
				break;
			}
		}
		
		for(int i=D; i>=L; i--) {
			if(digitSum(i) == X) {
				M = i;
				break;
			}
		}
		
		System.out.println(N + "\n" + M);
		
		io.close();
		System.exit(0);
	}

}
