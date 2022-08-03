package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon9012 {


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int size=0;
            String[] inputs = br.readLine()
                               .split("");

            for (int j = 0; j < inputs.length; j++) {
                switch (inputs[j]){
                    case "(":
                        size++;
                        break;
                    case ")":
                        size--;
                        break;
                }
                if (size < 0) {
                    sb.append("NO\n");
                    break;
                }
            }
            if(size > 0) {
                sb.append("NO\n");
            } else if (size == 0) {
                sb.append("YES\n");
            }
        }
        System.out.println(sb);
    }
}
