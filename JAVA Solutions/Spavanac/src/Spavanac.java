
public class Spavanac {
	
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in,System.out);
		
		int h = io.getInt();
		int m = io.getInt();
		
		m -= 45;
		if(m < 0) {
			if(h==0)
				h=23;
			else
				h--;
			m = 60 + m;
		}
		System.out.println(h +" "+m);
		
		io.close();
		System.exit(0);
	}
}
