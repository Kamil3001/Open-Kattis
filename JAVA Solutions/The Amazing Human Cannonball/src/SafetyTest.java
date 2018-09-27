
public class SafetyTest {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int N = io.getInt();
		
		while(N!=0) {
			double initialVelocity = io.getDouble();
			double angle = Math.toRadians(io.getDouble());
			double distance = io.getDouble();
			double lowerHeight = io.getDouble() + 1;
			double higherHeight = io.getDouble() - 1;
			
			double time = distance/(initialVelocity*Math.cos(angle));
			double height = initialVelocity*time*Math.sin(angle) - 4.905*time*time;
			
			if(height >= lowerHeight && height <= higherHeight)
				System.out.println("Safe");
			else
				System.out.println("Not Safe");
			N--;
		}
		
		io.close();
		System.exit(0);
	}

}
