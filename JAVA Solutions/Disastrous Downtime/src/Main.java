import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numOfRequests = sc.nextInt();
        int maxRequests = sc.nextInt();

        Comparator<Integer> comp = Comparator.reverseOrder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(comp);

        int available = 0;
        int servers = 0;
        for(int i=0; i<numOfRequests; i++){
            int currTime = sc.nextInt();
            while(pq.size() > 0 && pq.peek() <= currTime-1000){
                pq.remove(pq.peek());
                available++;
            }

            if(available == 0) {
                servers++;
                available+=maxRequests-1;
                pq.add(currTime);
            }
            else{
                available--;
                pq.add(currTime);
            }
        }

        System.out.println(servers);
    }
}
