package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon2839 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int weight = Integer.parseInt(br.readLine());

        int result = 0;

        while (true) {
            if(weight % 5 ==0) {
                result += weight / 5;
                System.out.println(result);
                break;
            } else {
                weight -= 3;
                result++;
            }

            if (weight < 0) {
                result = -1;
                System.out.println(result);
                break;
            }
        }
    }
}
