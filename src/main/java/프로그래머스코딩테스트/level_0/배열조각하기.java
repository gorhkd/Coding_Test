package 프로그래머스코딩테스트.level_0;

import java.util.Arrays;

public class 배열조각하기 {
    class Solution {
        public int[] solution(int[] arr, int[] query) {
            int start = 0;
            int end = arr.length;

            for (int i = 0; i < query.length; i++) {
                if (i % 2 == 0) {
                    end = start + query[i] + 1;
                } else {
                    start += query[i];
                }
            }

            return Arrays.copyOfRange(arr, start, end);
        }
    }
}
