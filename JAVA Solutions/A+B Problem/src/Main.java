import java.util.*;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeMap<Long, Long> freq = new TreeMap<>();

        for(int i=0; i<N; i++){
            long next = sc.nextLong();

            if(freq.containsKey(next)){
                freq.put(next, freq.get(next)+1);
            }
            else {
                freq.put(next, 1L);
            }
        }

        long[] keys = new long[freq.size()];
        int j =0;
        for(Long key : freq.keySet()){
            keys[j++] = key;
        }

        System.out.println(solve(freq, keys));
    }

    public static long solve(TreeMap map, long[] keys){
        long total = 0;

        for(int i=0; i<map.size(); i++){
            long a  = keys[i];
            long aFreq = (long) map.get(a);

            if(aFreq > 1 && map.containsKey(a+a)) {
                if(a==0){
                    total += (aFreq*(aFreq-1)*(aFreq-2))/6;
                }
                else {
                    total += ((aFreq * (aFreq - 1)) / 2) * (long) map.get(a+a);
                }
            }

            for(int j=i+1; j<map.size(); j++){
                long b = keys[j];
                long bFreq = (long)map.get(b);

                if(map.containsKey(a+b)){
                    if(b==0 && aFreq == 1 || a==0 && bFreq == 1)
                        continue;
                    else if(b==0 || a==0){
                        total += bFreq * aFreq;
                        continue;
                    }
                    total += aFreq * bFreq * (long)map.get(a+b);
                }
            }
        }

        return total*2;
    }
}
