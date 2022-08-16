package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon13335 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Queue<Integer> truck = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            truck.offer(Integer.parseInt(st.nextToken()));
        }

        int time = 0;
        int bridgeWeight = 0;
        Queue<Integer> bridgeQueue = new LinkedList<>();
        for (int i = 0; i < W; i++) {
            bridgeQueue.add(0);
        }

        while (!bridgeQueue.isEmpty()) {
            time++;
            bridgeWeight -= bridgeQueue.poll();
            if (!truck.isEmpty()) {
                if (truck.peek() + bridgeWeight <= L) {
                    bridgeWeight += truck.peek();
                    bridgeQueue.offer(truck.poll());
                } else {
                    bridgeQueue.offer(0);
                }
            }
        }
        System.out.println(time);
    }
}
