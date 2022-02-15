package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bo1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String six = "666";
        int count = 0;
        int start;
        for (start = 666; count <= 10000; start++) {
            if (String.valueOf(start).contains(six)) {
                count++;
            }
            if (count == n) {
                break;
            }
        }
        System.out.println(start);
    }
}
