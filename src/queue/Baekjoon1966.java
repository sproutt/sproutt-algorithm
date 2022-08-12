package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Baekjoon1966 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] firstInputs = br.readLine()
                           .split(" ");

            int N = Integer.parseInt(firstInputs[0]);
            int M = Integer.parseInt(firstInputs[1]);

            LinkedList<int[]> queue = new LinkedList<>();

            String[] secondInputs = br.readLine()
                           .split(" ");

            // 큐에 저장 완료
            for (int j = 0; j < N; j++) {
                queue.add(new int[]{j, Integer.parseInt(secondInputs[j])});
            }

            int count = 0;

            while (!queue.isEmpty()){
                int[] front = queue.pop();
                boolean isMax = true;

                for (int l = 0; l < queue.size(); l++) {
                    if (front[1] < queue.get(l)[1]) {
                        queue.add(front);
                        for (int m = 0; m < l; m++) {
                            queue.offer(queue.poll());
                        }
                        isMax = false;
                        break;
                    }
                }
                if (!isMax) {
                    continue;
                }

                count++;
                if (front[0] == M) {
                    break;
                }
            }
            sb.append(count)
              .append("\n");
        }
        System.out.println(sb);
    }
}
