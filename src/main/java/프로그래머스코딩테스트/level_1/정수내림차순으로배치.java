package 프로그래머스코딩테스트.level_1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치 {
    class Solution {
        public long solution(long n) {
            // 1. 숫자를 문자열로 변환
            String str = Long.toString(n);

            // 2. 문자 배열로 변환 후 내림차순 정렬
            String[] array = str.split("");
            Arrays.sort(array, Collections.reverseOrder());

            // 3. 정렬된 배열을 문자열로 합치고 숫자로 변환
            String sortedStr = String.join("", array);
            long answer = Long.parseLong(sortedStr);

            return answer;
        }
    }

}
