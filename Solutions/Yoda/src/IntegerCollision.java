
public class IntegerCollision {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		String N = io.getWord();
		String M = io.getWord();
		
		while(N.length() != M.length()) {
			if(N.length() > M.length())
				M = "0" + M;
			else
				N = "0" + N;
		}
		
		for(int i = N.length()-1; i >= 0; i--) {
			int one = Integer.parseInt(N.substring(i, i+1));
			int two = Integer.parseInt(M.substring(i, i+1));
			
			if(one < two)
				N = N.substring(0,i) + N.substring(i+1);
			else if(one > two)
				M = M.substring(0,i) + M.substring(i+1);
		}
		
		if(N.equals(""))
			System.out.println("YODA");
		else
			System.out.println(Integer.parseInt(N));
		
		if(M.equals(""))
			System.out.println("YODA");
		else
			System.out.println(Integer.parseInt(M));
		
		io.close();
		System.exit(0);
	}

}
