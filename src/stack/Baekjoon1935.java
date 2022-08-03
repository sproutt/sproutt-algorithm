package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon1935 {
    public static double[] stack;
    public static int size = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String postfix = br.readLine();

        double arr[] = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        stack = new double[postfix.length()];

        int size = postfix.length();

        for (int i = 0; i < size; i++) {
            char ch = postfix.charAt(i);
            if(ch >= 'A' && ch <= 'Z') { // 피 연산자
                push(arr[ch - 'A']);
            } else {
                double d1 = pop();
                double d2 = pop();
                double d3 = 0.0;
                switch (ch) {
                    case '+':
                        d3 = d2 + d1;
                        break;
                    case '-':
                        d3 = d2 - d1;
                        break;
                    case '*':
                        d3 = d2 * d1;
                        break;
                    case '/':
                        d3 = d2 / d1;
                        break;
                }
                push(d3);
            }
        }
        System.out.printf("%.2f", pop());
    }

    public static void push(double value) {
        stack[size] = value;
        size++;
    }

    public static double pop() {
        double poppedNumber = stack[size - 1];
        size--;
        return poppedNumber;
    }
}
