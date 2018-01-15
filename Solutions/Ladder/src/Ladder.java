
public class Ladder {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		int height = io.getInt();
		double angleSin = Math.sin(Math.toRadians(io.getInt()));
		
		int ladderLength = (int) Math.ceil(height/angleSin);
		
		System.out.println(ladderLength);
		io.close();
		System.exit(0);
	}

}
