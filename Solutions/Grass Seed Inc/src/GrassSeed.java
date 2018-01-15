
public class GrassSeed {

	public static void main(String[] args) {
		
		Kattio io = new Kattio(System.in, System.out);
		
		double seedCost = io.getDouble();
		int lawnNo = io.getInt();
		double totalArea = 0;
		
		while(lawnNo != 0) {
			double width = io.getDouble();
			double length = io.getDouble();
			totalArea += width*length;
			lawnNo--;
		}
		
		System.out.printf("%.6f", totalArea*seedCost);
		
		io.close();
		System.exit(0);
	}
}
