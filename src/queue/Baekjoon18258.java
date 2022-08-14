package queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Baekjoon18258 {
    private static int[] queue;
    private static int size;
    private static int front;
    private static int back;

    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        queue = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
        System.out.println(sb);
    }

    private static void push(int x) {
        queue[back] = x;
        size++;
        back++;
    }

    private static void pop() {
        if(size == 0) {
            sb.append(-1)
              .append("\n");
        } else {
            int poppedNumber = queue[front];

            size--;
            front++;
            sb.append(poppedNumber)
              .append("\n");
        }
    }

    private static void size() {
        sb.append(size)
          .append("\n");
    }
    
    private static void empty() {
        if(size == 0) {
            sb.append(1)
              .append("\n");
        } else {
            sb.append(0)
              .append("\n");
        }
    }

    private static void front() {
        if (size == 0) {
            sb.append(-1)
              .append("\n");
        } else {
            sb.append(queue[front])
              .append("\n");
        }
    }

    private static void back() {
        if (size == 0) {
            sb.append(-1)
              .append("\n");
        } else {
            sb.append(queue[back - 1])
              .append("\n");
        }
    }
}
