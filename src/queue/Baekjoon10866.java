package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon10866 {
    private static int[] deque;
    private static int size = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        deque = new int[N];


        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine()
                                .split(" ");

            switch (inputs[0]) {
                case "push_front":
                    push_front(Integer.parseInt(inputs[1]));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(inputs[1]));
                    break;
                case "pop_front":
                    sb.append(pop_front());
                    sb.append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back());
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

    private static void push_front(int x) {
        for (int i = deque.length-1; i > 0; i--) {
            deque[i] = deque[i-1];
        }
        deque[0] = x;

        size++;
    }

    private static void push_back(int x) {
        deque[size] = x;
        size++;
    }

    private static int pop_front() {
        if(size == 0) {
            return -1;
        }

        int poppedNumnber = deque[0];

        for (int i = 0; i < deque.length-1; i++) {
            deque[i] = deque[i + 1];
        }
        size--;

        return poppedNumnber;
    }

    private static int pop_back() {
        if (size == 0) {
            return -1;
        }

        int poppedNumber = deque[size - 1];
        size--;

        return poppedNumber;
    }

    private static int size() {
        return size;
    }

    private static int empty() {
        if(size == 0) {
            return 1;
        }
        return 0;
    }

    private static int front() {
        if(size == 0) {
            return -1;
        }
        return deque[0];
    }

    private static int back() {
        if (size == 0) {
            return -1;
        }
        return deque[size - 1];
    }
}
