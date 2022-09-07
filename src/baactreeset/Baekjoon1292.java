package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon1292 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        List<Integer> numbers = new ArrayList<>();


        for (int i = 1; i <=B; i++) {
            for (int j = 1; j <= i; j++) {
                numbers.add(i);
                if (numbers.size() == B) {
                    break;
                }
            }
            if (numbers.size() == B) {
                break;
            }
        }

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (i >= A - 1 && i <= B-1) {
                sum += numbers.get(i);
            }
        }

        System.out.println(sum);

        }
}

// 1 22 333 4444 55555