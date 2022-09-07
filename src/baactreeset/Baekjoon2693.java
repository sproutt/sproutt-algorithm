package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2693 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10];


        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j = 0;
            while (st.hasMoreTokens()) {
                arr[j] = Integer.parseInt(st.nextToken());
                j++;
            }
            Arrays.sort(arr);
            sb.append(arr[arr.length-3] + "\n");
        }

        System.out.println(sb);
    }
}
