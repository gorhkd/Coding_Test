package 프로그래머스코딩테스트.알고리즘.스택큐;

import java.util.Stack;

public class 같은숫자는싫어 {
    public class Solution {
        public Stack<Integer> solution(int []arr) {

            Stack<Integer> stack = new Stack<>();
            stack.push(arr[0]);

            for (int a : arr) {
                if(stack.peek() != a) {
                    stack.push(a);
                }
            }

            return stack;
        }
    }
}
