package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon10845 {
    private static int[] queue;
    private static int size=0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        queue = new int[N];

        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");
            switch (inputs[0]) {
                case "push":
                    push(Integer.parseInt(inputs[1]));
                    break;
                case "pop":
                    sb.append(pop());
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(size());
                    sb.append("\n");
                    break;
                case "empty":
                    sb.append(empty());
                    sb.append("\n");
                    break;
                case "front":
                    sb.append(front());
                    sb.append("\n");
                    break;
                case "back":
                    sb.append(back());
                    sb.append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }

    private static void push(int x) {
        queue[size] = x;
        size++;
    }

    private static int pop() {
        if(size == 0) {
            return -1;
        }

        int poppedNumber = queue[0];

        for (int i = 1; i < queue.length; i++) {
            queue[i-1] = queue[i];
        }

        size--;

        return poppedNumber;
    }

    private static int size() {
        return size;
    }

    private static int empty() {
        if (size == 0) {
            return 1;
        }
        return 0;
    }

    private static int front() {
        if(size == 0) {
            return -1;
        }
        return queue[0];
    }

    private static int back() {
        if(size == 0) {
            return -1;
        }
        return queue[size-1];
    }
}
