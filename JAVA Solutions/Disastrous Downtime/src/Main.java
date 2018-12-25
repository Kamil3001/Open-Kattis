import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 1;

        int[] times = new int[n];
        int firstIndex = 0;
        int tempOut = 1;

        times[0] = sc.nextInt();
        for(int i = 1; i < n; i++){

            times[i] = sc.nextInt();
            while(times[firstIndex] + 1000 <= times[i]){
                firstIndex++;
                tempOut--;
            }
            tempOut++;
            result = Math.max(result, tempOut);
        }

        System.out.println((int) Math.ceil(1.0*result / k));

    }
}
