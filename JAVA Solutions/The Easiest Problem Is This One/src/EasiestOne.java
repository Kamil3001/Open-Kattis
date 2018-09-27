
public class EasiestOne {
	
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
		int N=io.getInt();
		int i;
		while(N != 0) {
			int sumN = digitSum(N);
			for(i=11; ; i++) {
				if(sumN == digitSum(N*i))
					break;
			}
			
			System.out.println(i);
			N = io.getInt();
		}
		
		io.close();
		System.exit(0);
	}

}
