package 프로그래머스코딩테스트.알고리즘.스택큐;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            Queue<Integer> road = new LinkedList<>();
            int time = 0;
            int index = 0;
            int sumWeight = 0;

            for (int i = 0; i < bridge_length; i++) {
                road.add(0);
            }

            while (index < truck_weights.length) {
                time++;
                sumWeight -= road.poll();

                if(sumWeight + truck_weights[index] <= weight) {
                    sumWeight += truck_weights[index];
                    road.add(truck_weights[index]);
                    index++;
                }else {
                    road.add(0);
                }
            }
            return time + bridge_length;
        }
    }
}

// 1. bridge_length 만큼의 길이로 0을 담은 배열 생성. => 도로 생성
// 2. truck_weights 이 하나씩 도로 진출.
// 3. 만약 도로 위 총 무개에 새 트럭이 들어가도 괜찮으면 출발,
// 아니면 1초 지남.
// 그렇게 모든 트럭이 지나가면 초 반환.
