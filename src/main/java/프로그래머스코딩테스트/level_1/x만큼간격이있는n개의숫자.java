package 프로그래머스코딩테스트.level_1;

public class x만큼간격이있는n개의숫자 {
    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            long num = x;

            for(int i = 0; i < n; i++){
             answer[i] = num;
             num += x;
            }
            return answer;
        }
    }
}

// 1. answer 배열에 x를 집어넣고, i만큼 곱해준다.