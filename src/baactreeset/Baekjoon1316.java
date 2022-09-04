package baactreeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1316 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                result++;
            }
        }

        System.out.println(result);
    }

    public static boolean check() throws IOException {
        boolean[] arr = new boolean[26];

        String input = br.readLine();

        int before = 0;
        for (int j = 0; j < input.length(); j++) {

            int now = input.charAt(j);

            if(before != now) {
                if(!arr[now - 'a']) {
                    arr[now-'a'] = true;
                    before = now;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}
