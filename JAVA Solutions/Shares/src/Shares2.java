import java.util.ArrayList;

public class Shares2 {

	private static class Share{
		public int price_today;
		public int profit;
		
		Share(int price_today, int price_tomorrow) {
			this.price_today = price_today;
			profit = price_tomorrow - price_today;
		}
	}
	
	private static class Pack{
		public int profit;
		public int cost;
		
		Pack(int cost, int profit){
			this.cost = cost;
			this.profit = profit;
		}
		
		public String toString() {
			return cost + " " + profit;
		}
	}
	
	/*
	 * Adds elements to the ArrayList in decreasing order of cost
	 */
	public static void addInOrder(ArrayList<Pack> packs, Pack p) {
		if(packs.isEmpty()) {
			packs.add(p);
			return;
		}
		
		int i=0, size = packs.size();
		//splitting insertion area in half
		if(p.cost <= packs.get(size/2).cost)
			i = size/2;
		else
			i = 0;
		
		//inserting the pack in the correct slot
		for(;i<size; i++) {
			if(p.cost >= packs.get(i).cost)
			{
				packs.add(i, p);
				i = size;
			}
			else if(i == size-1)
				packs.add(p);
		}
	}
	
	public static boolean checkOrder(ArrayList<Pack> packs) {
		for(int i=1; i<packs.size(); i++) {
			if(packs.get(i).cost > packs.get(i-1).cost)
				return false;
		}
		return true;
	}
	
	/*
	 * Finds the Expected Optimum Profit to be earned below capital
	 */	
	public static int getProfit(ArrayList<Pack> packs, int Capital) {
		int Profit=0;
		int CostSum=0;
		int ProfitSum=0;
		
		if(packs.isEmpty())
			return 0;
		
		for(int i=0; i<packs.size()-1; i++) {
			for(int j=packs.size()-1; j>i; j--) {
				CostSum = packs.get(i).cost;
				ProfitSum = packs.get(i).profit;
				
				if(CostSum <= Capital && ProfitSum > Profit)
					Profit = ProfitSum;
				
				for(int k=j; k>i; k--) {
					CostSum += packs.get(k).cost;
					if(CostSum > Capital) {
						if(j==k) {
							j=i;
							break;
						}
						else {
							if(ProfitSum>Profit)
								Profit = ProfitSum;
							break;
						}
					}
					else {
						ProfitSum += packs.get(k).profit;
						if(ProfitSum > Profit)
							Profit = ProfitSum;
					}
				}
			}
		}
		
		return Profit;
	}
	/*
	 * Solves the problem
	 */
	public static void solve(Kattio io) {
		int Capital = io.getInt(); // 0 < C <= 2^30
		int Number_Of_Shares = io.getInt(); // 0 < N <= 500
		int Number_Of_Packs = io.getInt(); // 0 < P <= 50000
		
		//reading shares into an array
		Share[] shares = new Share[Number_Of_Shares];
		for(int i=0; i<Number_Of_Shares; i++) {
			int price_today = io.getInt(); // 0 < a <= 2^30
			int price_tomorrow = io.getInt(); // 0 < t <= 2^30
			shares[i] = new Share(price_today, price_tomorrow);
		}
		
		//reading in pack info and processing it into an arrayList
		ArrayList<Pack> packs = new ArrayList<Pack>();
		for(int i=0; i<Number_Of_Packs; i++) {
			int Shares_Per_Pack = io.getInt(); // 1 <= R <= N
			
			//extracting info for current pack and summing cost and profit
			int Sum_Of_Cost = 0;
			int Sum_Of_Profit = 0;
			for(int j=0; j<Shares_Per_Pack; j++) {
				int Share_ID = io.getInt(); // 1 <= s <= N
				int Quantity = io.getInt(); // 0 < q <= 2^30
				
				Sum_Of_Cost += shares[Share_ID-1].price_today*Quantity;
				Sum_Of_Profit += shares[Share_ID-1].profit*Quantity;
			}
			if(Sum_Of_Profit <= 0 || Sum_Of_Cost > Capital)
				continue;
			
			addInOrder(packs, new Pack(Sum_Of_Cost, Sum_Of_Profit));
		}
		
		int Profit = getProfit(packs, Capital);
		for(Pack p:packs)
			System.out.println(p.profit);
		//System.out.println(packs.size());
		System.out.println(Profit);
	}
	
	/*
	 * Runs the solution
	 */
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		//solve(io);
		int x = 1;
		int y;
		ArrayList<Pack> packs = new ArrayList<Pack>();
		while(x!=0)
		{
			x = io.getInt();
			y = io.getInt();
			
			addInOrder(packs, new Pack(x, y));
		}
		System.out.println(getProfit(packs, 1073741312));
		io.close();
		System.exit(0);
	}

}
