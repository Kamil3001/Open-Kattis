import java.util.ArrayList;

public class Modulo {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		int mod = 42;
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(io.getInt()%mod);
		for(int i=1; i<10; i++) {
			int temp = io.getInt()%mod;
			for(int j=0; j<array.size(); j++) {
				if(array.get(j) == temp) {
					break;
				}
				else if(j+1 == array.size()) {
					array.add(temp);
				}
			}
		}
		System.out.println(array.size());
		io.close();
		System.exit(0);
	}
}
