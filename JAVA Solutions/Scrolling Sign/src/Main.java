public class Main {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int n = io.getInt();

        while(n != 0){
            int k = io.getInt();
            int w = io.getInt()-1;
            int letter_count = k;
            String word = io.getWord();

            while(w != 0){
                String next = io.getWord();
                int reusables = countReusableLetters(word, next);
                letter_count += k - reusables;

                word = next;
                w--;
            }

            System.out.println(letter_count);
            n--;
        }
    }

    public static int countReusableLetters(String x, String y){
        if(x.equals(y))
            return x.length();

        for(int i=1; i<x.length(); i++){
            if(x.substring(i, x.length()).equals(y.substring(0, y.length()-i)))
                return x.length()-i;
        }

        return 0;
    }
}
