package 프로그래머스코딩테스트.level_1;

public class 나머지가1이되는수찾기 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 1) {
                    answer = i;
                    break;
                }
            }
            return answer;
        }
    }
}
// 1. n을 나눈 나머지가 1이 될때, x값을 리턴한다.
