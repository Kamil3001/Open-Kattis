import java.util.ArrayList;

public class Shares {

	//a share class to store today's share price as well as the difference between it and tomorrow's price
	private static class Share{
		public int price_today;
		public int difference;
		
		Share(int price_today, int price_tomorrow) {
			this.price_today = price_today;
			difference = price_tomorrow - price_today;
		}
	}
	
	//a pack class to store the cost of a pack and the profit it will make next day
	private static class Pack{
		public long profit;
		public long cost;
		
		Pack(long profit, long cost){
			this.profit = profit;
			this.cost = cost;
		}
	}
	
	//adds the packs to the array list in a descending order
	private static void addInOrder(ArrayList<Pack> packs, Pack x) {
		int i;
		if(x.cost <= packs.get(packs.size()/2).cost) {
			i = packs.size()/2;
		}
		else
			i = 0;
		
		for(;i<packs.size(); i++) {
			if(packs.get(i).cost <= x.cost) {
				packs.add(i, x);
				break;
			}
			else if(i==packs.size()-1) {
				packs.add(x);
				break;
			}
		}
	}
	
	//computes the max profit to be earned from the packs
	private static long findMaxProfit(ArrayList<Pack> sortedPacks, int capital) {
		long maxProfit=0, profitSum=0;
		long sum = 0;
		if(sortedPacks.size() == 0)
			return 0;
		else if(sortedPacks.size() == 1 && sortedPacks.get(0).cost <= capital)
			return sortedPacks.get(0).profit;
		
		for(int i=0; i<sortedPacks.size(); i++) {
			sum = sortedPacks.get(i).cost;
			if(sum<=capital) {
				profitSum = sortedPacks.get(i).profit;
			}
			for(int k=sortedPacks.size()-1; k>i; k--) {
				sum = sortedPacks.get(i).cost;
				if(sum<=capital) {
					profitSum = sortedPacks.get(i).profit;
				}
				for(int j=k; j>i; j--) {
					sum += sortedPacks.get(j).cost;
					if(sum > capital) {
						if(profitSum > maxProfit)
							maxProfit = profitSum;
						break;
					}
					else {
						profitSum += sortedPacks.get(j).profit;
						if(profitSum > maxProfit)
							maxProfit = profitSum;
					}
				}
			}
			if(profitSum > maxProfit)
				maxProfit = profitSum;
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		
		//getting the basic info first
		int capital = io.getInt();
		int number_of_shares = io.getInt();
		int number_of_packs = io.getInt();
		
		//an array list for shares
		Share[] shares = new Share[number_of_shares];
		//filling the array with shares
		for(int i=0; i<number_of_shares; i++) {
			shares[i] = new Share(io.getInt(), io.getInt());
		}
		
		//going through various packs and selecting best based on profit
		ArrayList<Pack> packs = new ArrayList<Pack>();
		for(int i=0; i<number_of_packs; i++) {
			int shares_per_pack = io.getInt();
			long cost = 0, profit = 0;
			
			//going through each share of a pack to compute cost and profit of pack
			for(int j=0; j<shares_per_pack; j++) {
				int share_id = io.getInt();
				long quantity_of_share = io.getLong();
				cost += ((long)shares[share_id-1].price_today * quantity_of_share);
				profit += ((long)shares[share_id-1].difference * quantity_of_share);
			}
			//if(profit > 0) {
			addInOrder(packs, new Pack(profit, cost));
			//}
		}
		//getting the maximum profit
		System.out.println(findMaxProfit(packs, capital));
		
		/*ArrayList<Pack> packs = new ArrayList<Pack>();
		for(int i = 0; i<100;i++)
			addInOrder(packs, new Pack(io.getLong(), io.getLong()));
		for(Pack p: packs) {
			System.out.println(p.cost +" "+p.profit);
		}
		System.out.println("profit: "+findMaxProfit(packs, 500));*/
		io.close();
		System.exit(0);
	}

}
