package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10828 {
    private static int[] stack;
    private static int size = 0;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        stack = new int[N];


        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine()
                           .split(" ");
            switch (inputs[0]) {
                case "push":
                    push(Integer.parseInt(inputs[1]));
                    break;
                case "pop":
                    sb.append(pop() + "\n");
                    break;
                case "size":
                    sb.append(size + "\n");
                    break;
                case "empty":
                    sb.append(empty()+"\n");
                    break;
                case "top":
                    sb.append(top()+"\n");
                    break;
            }
        }
        System.out.println(sb);

    }
    public static void push(int x) {
        stack[size] = x;
        size++;
    }

    public static int pop() {
        if(size != 0) {
            int poppedNumber = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return poppedNumber;
        }
        return -1;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size != 0) {
            return 0;
        }
        return 1;
    }

    public static int top() {
        if(size != 0) {
            return stack[size-1];
        }
        return -1;
    }
}
