import java.awt.Point;

public class Cetvrta {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		Point a = new Point(io.getInt(), io.getInt());
		Point b = new Point(io.getInt(), io.getInt());
		Point c = new Point(io.getInt(), io.getInt());
		Point d = new Point();
		
		if((int)a.getX() == (int)b.getX())
			d.x = (int) c.getX();
		else if((int)a.getX() == (int)c.getX())
			d.x = (int) b.getX();
		else
			d.x = (int) a.getX();
		
		if((int)a.getY() == (int)b.getY())
			d.y = (int) c.getY();
		else if((int)a.getY() == (int)c.getY())
			d.y = (int) b.getY();
		else
			d.y = (int) a.getY();
		
		System.out.println(d.x + " "+ d.y);
		io.close();
		System.exit(0);
	}

}
