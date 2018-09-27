
public class Datum {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int[] monthDay = {4, 0, 0, 3, 5, 1, 3, 6, 2, 4, 0, 2};
		int day = io.getInt();
		int month = io.getInt();
		
		int x = (monthDay[month-1] + day-1) % 7;
		System.out.println(days[x]);
		
		io.close();
		System.exit(0);
	}
	
}
