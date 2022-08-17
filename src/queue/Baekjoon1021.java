package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon1021 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        LinkedList<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] position = new int[M];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            position[i] = Integer.parseInt(st.nextToken());
        }

        // 큐 초기화
        // 만약 10 이면 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 이 들어가 있음
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }


        int pollCount = 0;
        int result = 0;

        for (int i = 0; i < M; i++) {
            int halfIndex = 0;

            if(deque.size() % 2 == 0) {
                halfIndex = deque.size() / 2 - 1;
            } else {
                halfIndex = deque.size() / 2;
            }

            int positionInDeque = deque.indexOf(position[i]);
            if (positionInDeque <= halfIndex) {
                // 왼쪽으로 한 칸 이동 시키는게 더 빠름
                for (int j = 0; j < positionInDeque; j++) {
                    // 앞에 뽑아서 뒤로 추가함
                    deque.offerLast(deque.pollFirst());
                    result++;
                }
            } else if (positionInDeque > halfIndex) {
                // 오른쪽으로 한 칸 이동 시키는게 빠름
                for (int j = 0; j < deque.size() - positionInDeque; j++) {
                    // 뒤에 뽑아서 앞으로 추가함
                    deque.offerFirst(deque.pollLast());
                    result++;
                }
            }
            deque.pollFirst();

        }
        System.out.println(result);
    }
}
