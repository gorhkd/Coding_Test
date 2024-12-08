package 프로그래머스코딩테스트.level_2;

import java.util.Arrays;

public class 최솟값만들기 {
    class Solution {
        public int solution(int []A, int []B){
            Arrays.sort(A);
            Arrays.sort(B);
            int totalSum = 0;

            for(int i = 0; i <= A.length - 1; i++){
                totalSum += A[i] * B[A.length - i - 1];
            }

            return totalSum;
        }
    }
}
