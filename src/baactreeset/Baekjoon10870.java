package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon10870 {
    private static int result = 0;
    private static int count = 1;
    private static int n = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        if(n==0) {
            System.out.println(0);
        } else if(n==1) {
            System.out.println(1);
        } else {
            function(0, 1);
        }
    }

    private static void function(int a, int b) {
        if(count == n) {
            System.out.println(result);
            return;
        }

        count++;

        result = a + b;
        function(b, result);
    }
}
