
public class Problem_2048 {

	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int left = 0, up=1, right=2,i,j;
		int[][] grid = new int[4][4];
		
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				grid[i][j] = io.getInt();
			}
		}
		int move = io.getInt();
		int curr;
		
		if(move == left) {
			for(i=0; i<4; i++) {
				j=0;
				curr = j++;
				while(j<4) {
					if(grid[i][curr] == 0) {
						if(grid[i][j] != 0) {
							grid[i][curr] = grid[i][j];
							grid[i][j] = 0;
						}
						else
							j++;
					}
					else if(grid[i][j] == 0)
						j++;
					else if(grid[i][curr] == grid[i][j]) {
						grid[i][curr] *=2;
						grid[i][j]=0;
						curr++;
						j=curr+1;
					}
					else {
						curr++;
						j=curr+1;
					}
				}
			}
		}
		else if(move == right) {
			for(i=0; i<4; i++) {
				j=3;
				curr = j--;
				while(j>=0) {
					if(grid[i][curr] == 0) {
						if(grid[i][j] != 0) {
							grid[i][curr] = grid[i][j];
							grid[i][j] = 0;
						}
						else
							j--;
					}
					else if(grid[i][j] == 0)
						j--;
					else if(grid[i][curr] == grid[i][j]) {
						grid[i][curr] *=2;
						grid[i][j]=0;
						curr--;
						j=curr-1;
					}
					else {
						curr--;
						j=curr-1;
					}
				}
			}
		}
		else if(move == up) {
			for(j=0; j<4; j++) {
				i=0;
				curr = i++;
				while(i<4) {
					if(grid[curr][j] == 0) {
						if(grid[i][j] != 0) {
							grid[curr][j] = grid[i][j];
							grid[i][j] = 0;
						}
						else
							i++;
					}
					else if(grid[i][j] == 0)
						i++;
					else if(grid[curr][j] == grid[i][j]) {
						grid[curr][j] *=2;
						grid[i][j]=0;
						curr++;
						i=curr+1;
					}
					else {
						curr++;
						i=curr+1;
					}
				}
			}
		}
		else if(move == 3){
			for(j=0; j<4; j++) {
				i=3;
				curr = i--;
				while(i>=0) {
					if(grid[curr][j] == 0) {
						if(grid[i][j] != 0) {
							grid[curr][j] = grid[i][j];
							grid[i][j] = 0;
						}
						else
							i--;
					}
					else if(grid[i][j] == 0)
						i--;
					else if(grid[curr][j] == grid[i][j]) {
						grid[curr][j] *=2;
						grid[i][j]=0;
						curr--;
						i=curr-1;
					}
					else {
						curr--;
						i=curr-1;
					}
				}
			}
		}
		
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		
		io.close();
		System.exit(0);
	}

}
