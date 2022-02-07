package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bo2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int answer = 0;
        for (int i = n; i >0 ; i--) {
            if (dividePlus(i) == n) {
                answer = i;
            }
        }
        System.out.println(answer);
    }
    public static int dividePlus(int value) {
        int big = 1000000;
        int sum = value;
        while (big >= 1) {
            sum += value / big;
            value %= big;
            big /= 10;
        }
        return sum;
    }
}
