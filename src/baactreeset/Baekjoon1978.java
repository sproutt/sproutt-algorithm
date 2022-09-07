package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1978 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());

            boolean isPrime = false;
            for (int j = 1; j <= number; j++) {
                if(number == 1) {
                    isPrime = false;
                    break;
                }

                if((j!=1 && j != number) && number % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }

            if(isPrime) {
                count++;
            }
        }

        System.out.println(count);
    }
}
