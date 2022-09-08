package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon2581 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 1; j < i; j++) {

                if(i==1) {
                    isPrime = false;
                    break;
                }

                if (i % j == 0 && j != 1) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i != 1) {
                sum += i;
                primeNumbers.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();

        if(primeNumbers.size() == 0){
            System.out.println(-1);

        } else {
            sb.append(sum)
              .append("\n");

            sb.append(primeNumbers.get(0));

            System.out.println(sb);

        }
    }
}
