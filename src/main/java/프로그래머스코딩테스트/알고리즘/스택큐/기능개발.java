package 프로그래머스코딩테스트.알고리즘.스택큐;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {

    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {

            // 배포 날짜를 담을 큐 생성
            Queue<Integer> days = new LinkedList<>();
            for (int i = 0; i < progresses.length; i++) {

                // 배포 날자 계산 후 담기.
                int remainingDays = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
                days.offer(remainingDays);
            }

            // 배포 가능한 기능 끼리 담을 배열 생성
            List<Integer> result = new ArrayList<>();

            // 첫번째 기능은 항상 1부터 시작
            int previousDay = days.poll();
            int count = 1;

            while (!days.isEmpty()) {
                int currentDay = days.poll();
                if (currentDay <= previousDay) {
                    count++;
                } else {
                    result.add(count);
                    count = 1;
                    previousDay = currentDay;
                }
            }

            result.add(count);

            return result.stream().mapToInt(i -> i).toArray();
        }
    }
}