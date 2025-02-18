package 프로그래머스코딩테스트;

import java.util.*;

public class 연습장 {

    class Request {
        int startTime;
        int duration;
        int type;

        Request(int startTime, int duration, int type) {
            this.startTime = startTime;
            this.duration = duration;
            this.type = type;
        }
    }

    public class Solution {
        public int solution(int k, int n, int[][] reqs) {
            // 상담 요청을 유형별로 분류
            List<Request>[] requests = new ArrayList[k];
            for (int i = 0; i < k; i++) {
                requests[i] = new ArrayList<>();
            }

            // 요청 데이터를 적절한 유형에 넣기
            for (int[] req : reqs) {
                int startTime = req[0];
                int duration = req[1];
                int type = req[2];
                requests[type - 1].add(new Request(startTime, duration, type));
            }

            int totalTime = 0;

            // 각 유형별로 상담을 배정
            for (int i = 0; i < k; i++) {
                // 현재 상담 유형에 대해 우선순위 큐 사용
                PriorityQueue<Integer> pq = new PriorityQueue<>();

                // 상담 요청을 시작시간에 따라 오름차순으로 정렬
                requests[i].sort(Comparator.comparingInt(req -> req.startTime));

                // 각 상담 요청에 대해 상담을 배정
                for (Request req : requests[i]) {
                    if (pq.size() < n - k) {
                        // 아직 상담 중인 멘토가 적은 경우
                        pq.add(req.startTime + req.duration);
                    } else {
                        // 멘토가 꽉 찬 경우
                        int nextAvailableTime = pq.poll(); // 가장 빨리 비는 멘토의 종료 시간
                        int newEndTime = Math.max(nextAvailableTime, req.startTime) + req.duration;
                        pq.add(newEndTime); // 새로운 상담 종료 시간 넣기
                    }
                }

                // 이 유형에 대해 대기 시간(마지막 종료 시간)을 계산
                totalTime = Math.max(totalTime, pq.stream().max(Integer::compare).orElse(0));
            }

            return totalTime;
        }
    }
// n 명의 멘토, 1~k번의 상당 유형, 멘토는 k개의 상담 유형 중 하나만 담당.
// 상담 중이면 멘토 불가능, 최대한 덜기다리도록
}
