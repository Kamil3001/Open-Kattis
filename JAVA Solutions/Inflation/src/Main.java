import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] canisters = new int[n];
        for(int i=0; i<n; i++){
            canisters[i] = sc.nextInt();
        }

        Arrays.sort(canisters);
        double min = 2;
        boolean possible = true;
        for(int i=0; i<n; i++){
            double fraction = canisters[i]/(i+1.0);
            min = Math.min(fraction, min);
            if(fraction > 1){
                System.out.println("impossible");
                possible = false;
                break;
            }
        }
        if(possible)
            System.out.println(min);

    }
}
