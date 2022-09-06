package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon3460 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String binaryString = Integer.toBinaryString(Integer.parseInt(br.readLine()));
            int[] arr = new int[binaryString.length()];

            int index = 0;
            for (int j = binaryString.length()-1; j >= 0; j--) {
                arr[index] = Integer.parseInt(String.valueOf(binaryString.charAt(j)));
                index++;
            }

            for (int k = 0; k < arr.length; k++) {
                if(arr[k] == 1) {
                    sb.append(k + " ");
                }
            }
        }

        System.out.println(sb);
    }
}
