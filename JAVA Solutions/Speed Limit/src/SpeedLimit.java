
public class SpeedLimit {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in);
		int n, speed, prevT, currT;
		while((n = io.getInt()) != -1) {
			currT = 0;
			int distance = 0;
			while(n != 0) {
				speed = io.getInt();
				prevT = currT;
				currT = io.getInt();
				distance += speed*(currT - prevT);
				n--;
			}
			System.out.println(distance + " miles");
		}
		
		io.close();
		System.exit(0);
	}

}
