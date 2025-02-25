package 프로그래머스코딩테스트.알고리즘.스택큐;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프로세스 {
    class Solution {
        public int solution(int[] priorities, int location) {
            Queue<int[]> queues = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            int count = 0;

            for (int priority : priorities) {
                priorityQueue.add(priority);
            }

            for (int i = 0; i < priorities.length; i++) {
                queues.add(new int[]{priorities[i], i});
            }

            while (!queues.isEmpty()) {
                int[] q = queues.poll();

                if (q[0] < priorityQueue.peek()) {
                    queues.add(q);
                } else {
                    priorityQueue.poll();
                    count++;
                    if (q[1] == location) {
                        return count;
                    }
                }
            }
            return count;
        }
    }
}
// 1. 큐를 2차 배열로 (우선순위, 위치) 형태로 만든다.
// 2. 첫번째를 꺼내서 max로 더 높은 숫자가 있으면, offer로 뒤로 보낸다.
// 3. 우선순위대로 실행 할때마다 count+.
// 4. location 번호와 같으면 count 반환.

