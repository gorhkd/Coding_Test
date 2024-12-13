package 프로그래머스코딩테스트.level_2;

public class 숫자의표현 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i = 1; i <= n; i++) {
                int num = i;
                int sum = 0;
                while (sum < n) {
                    sum += num;
                    if(sum == n){
                        answer++;
                    }
                    num++;
                }
            }
            return answer;
        }
    }
}
