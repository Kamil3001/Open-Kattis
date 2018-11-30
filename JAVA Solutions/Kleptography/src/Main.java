import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] keyword = sc.next().toCharArray();
        char[] cipher = sc.next().toCharArray();
        char[] secret = new char[m];

        for(int i=0; i<n; i++){
            secret[m-1-i] = keyword[n-1-i];
        }

        for(int i=0; i<m-n; i++){
            secret[m-n-1-i] = (char) (((cipher[m-1-i] - secret[m-1-i] +26)%26)+97);
        }

        System.out.println(secret);
    }
}

