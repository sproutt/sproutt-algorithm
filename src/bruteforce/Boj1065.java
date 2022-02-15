package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int answer = 0;
        if (n >= 100) {
            answer += 99;
            answer += hansu(n);
            System.out.println(answer);
        } else {
            System.out.println(n);
        }
    }

    public static int hansu(int n) {
        int count = 0;
        for (int i = 100; i < n + 1; i++) {
            int hundred = i / 100;
            int ten = (i % 100) / 10;
            int one = (i % 10);
            if ((hundred + one) == (ten * 2)) {
                count++;
            }
        }
        return count;
    }
}
