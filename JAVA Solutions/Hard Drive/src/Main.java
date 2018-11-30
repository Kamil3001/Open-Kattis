import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();

        int[] bits = new int[n];
        boolean[] broken = new boolean[n];
        for(int i=0; i<b; i++){
            broken[sc.nextInt()-1] = true;
        }

        int i=n-2;
        while(c > 1) {
            if (!broken[i]){
                bits[i] = 1;
                c-=2;
                i-=2;
            }
            else
                i--;
        }
        if(c == 1)
            bits[0] = 1;

        for(int j=0; j<n; j++)
            System.out.print(bits[j]);
    }
}
