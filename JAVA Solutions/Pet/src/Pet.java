
public class Pet {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int sum = 0;
		int num = 0;
		
		for(int i=1; i<=5; i++) {
			int tempSum = io.getInt() + io.getInt() + io.getInt() + io.getInt();
			if(tempSum > sum) {
				sum = tempSum;
				num = i;
			}
			tempSum = 0;
		}
		System.out.println(num + " " + sum);
		
		io.close();
		System.exit(0);
	}

}
