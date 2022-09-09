package baactreeset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon2504 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        boolean flag = true;

        int result = 0;
        int temp = 1;

        String inputs = br.readLine();

        for (int i = 0; i < inputs.length(); i++) {
            char c = inputs.charAt(i);

            switch (c) {
                case '(':
                    temp *= 2;
                    stack.push(c);
                    break;
                case '[':
                    temp *= 3;
                    stack.push(c);
                    break;
                case ')':
                    // stack이 비어있거나 앞서 (가 스택에 push되어 있지 않을 경우, 불완전한 괄호
                    if (stack.isEmpty() || stack.peek() != '(') {
                        flag = false;
                        break;
                    }
                    // stack이 비어있지 않고, 바로 이전 문자가 (일 경우.
                    // stack.peek()을 쓰지 않는 이유는 (뿐만 아니라 [도 push 되어 있을 수 있기 때문이다.
                    // 이 경우에는 분배법칙을 구현하기 위해 지금까지의 값을 result에 더해 저장한다.
                    if (inputs.charAt(i-1) == '(') {
                        result += temp;
                    }
                    stack.pop(); // )와 짝이 되는 (를 pop 한다.
                    temp /= 2; // (가 push될때 무조건 2를 곱하게 되고, 이미 result에 값이 더해진 이후이므로 다음 계산을 위해 다시 2를 나누어 준다.
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        flag = false;
                        break;
                    }
                    if (inputs.charAt(i-1) == '[') {
                        result += temp;
                    }
                    stack.pop();
                    temp /= 3;
                    break;
            }
        }

        if (!flag || !stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}
