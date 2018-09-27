
public class Solution {
	
	public static void main(String[] args) {
		
		Kattio io = new Kattio(System.in, System.out);
		
		int N = io.getInt();
		
		for(int i=1; i<=N; i++)
		{
			System.out.println(i + " Abracadabra");
		}
		
		io.close();
		System.exit(0);
	}
}
