import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class Main {

    private static int compute(int[] ops){
        Deque<Integer> numStack = new ArrayDeque<>();
        Deque<Integer> opStack = new ArrayDeque<>();
        numStack.push(4);

        for(int i=0; i<ops.length; i++){
            int x = ops[i];

            if(x == 1 || x == 2) {
                numStack.addLast(4);
                opStack.addLast(x);
            }
            else if(x == 0)
                numStack.addLast(numStack.removeLast() * 4);
            else
                numStack.addLast(numStack.removeLast() / 4);

            //System.out.println(numStack.peek());
        }

        while(!opStack.isEmpty()){
            int x = opStack.removeFirst();
            if(x == 1)
                numStack.addFirst(numStack.removeFirst() + numStack.removeFirst());
            else
                numStack.addFirst(numStack.removeFirst() - numStack.removeFirst());
        }

        //System.out.println(numStack.size());
        return numStack.pop();
    }

    //does not follow precedence rules!
    private static HashMap<Integer, String> getPossibilities(){
        String[] ops = {"*", "+", "-", "/"};
        HashMap<Integer, String> possibilities = new HashMap<>();

        for(int i=0; i<ops.length; i++){
            for(int j=0; j<ops.length; j++){
                for(int k=0; k<ops.length; k++) {
                    int[] x = {i, j, k};
                    int sol = compute(x);
                    String possibility = "4 " + ops[i] + " 4 " + ops[j] + " 4 " + ops[k] + " 4 = " + sol;
                    //System.out.println(possibility);
                    possibilities.put(sol, possibility);
                }
            }
        }

        return possibilities;
    }



    public static void main(String[] args){
        HashMap<Integer, String> map = getPossibilities();
        Kattio io = new Kattio(System.in, System.out);
        int m = io.getInt();

        while(m > 0){
            int n = io.getInt();
            if(map.containsKey(n))
                System.out.println(map.get(n));
            else
                System.out.println("no solution");

            m--;
        }
    }
}
