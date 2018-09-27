import java.util.HashSet;
import java.util.Set;

public class OddManOut {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		int N = io.getInt();
		
		for(int i=1; i<=N; i++) {
			Set<Integer> inviteNums = new HashSet<>();
			int guests = io.getInt();
			for(int j=0; j<guests; j++) {
				int C = io.getInt();
				if(inviteNums.contains(C))
					inviteNums.remove(C);
				else
					inviteNums.add(C);
			}
			io.printf("Case #%d: %d\n", i, inviteNums.iterator().next());
		}
		
		io.close();
		System.exit(0);
	}

}
