import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Kattio sc = new Kattio(System.in);

        int n = sc.getInt();
        int m = sc.getInt();
        int[] nums;

        while(n > 0 || m > 0) {

            nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.getInt();
            }

            int j = 0;
            int count = 0;
            for (int i = 0; i < m; i++) {
                int curr = sc.getInt();
                while (j < n && curr > nums[j]) {
                    j++;
                }

                if (j < n && curr == nums[j])
                    count++;
            }
            System.out.println(count);
            n = sc.getInt();
            m = sc.getInt();
        }
        sc.close();
    }
}
