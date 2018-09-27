import java.util.ArrayList;

public class ICPCAwards {

	private static class Team{
		String uni;
		String teamName;
		
		public Team(String uni, String teamName) {
			this.uni = uni;
			this.teamName = teamName;
		}
		
		public String toString() {
			return uni + " " + teamName;
		}
	}
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int num_of_teams = io.getInt() - 1;
		ArrayList<Team> winners = new ArrayList<Team>();
		winners.add(new Team(io.getWord(), io.getWord()));
		System.out.println(winners.get(0));
		
		while(num_of_teams != 0 && winners.size() < 12) {
			Team temp = new Team(io.getWord(), io.getWord());
			
			for(int i=0; i<winners.size(); i++) {
				if(temp.uni.equals(winners.get(i).uni))
					break;
				else if(i+1 == winners.size()) {
					winners.add(temp);
					System.out.println(temp);
					break;
				}
			}
			
			num_of_teams--;
		}
		
		io.close();
		System.exit(0);
	}

}
