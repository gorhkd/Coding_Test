package 프로그래머스코딩테스트.level_2;

import java.util.Arrays;

public class 최솟값만들기 {
    class Solution {
        public int solution(int []A, int []B){
            int totalSum = 0;
            int length = A.length - 1;

            Arrays.sort(A);
            Arrays.sort(B);

            for(int i = 0; i <= length; i++){
                totalSum += A[i] * B[length - i];
            }

            return totalSum;
        }
    }
}
