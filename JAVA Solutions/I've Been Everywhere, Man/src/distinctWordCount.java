import java.util.ArrayList;

public class distinctWordCount {
	
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int testCaseNum = io.getInt();
		ArrayList<String> words = new ArrayList<String>();
		
		while(testCaseNum != 0) {
			int citiesNum = io.getInt() - 1;
			words.add(io.getWord());
			
			while(citiesNum != 0) {
				String nxtWord = io.getWord();
				for(int i=0; i<words.size(); i++) {
					if(words.get(i).equals(nxtWord)) {
						break;
					}
					else if(i+1 == words.size())
						words.add(nxtWord);
				}
				citiesNum--;
			}
			System.out.println(words.size());
			words.clear();
			testCaseNum--;
		}
		
		io.close();
		System.exit(0);
	}
}
