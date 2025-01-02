package 프로그래머스코딩테스트.level_1;

public class 자연수뒤집어배열 {
    class Solution {
        public int[] solution(long n) {
            String str = Long.toString(n);
            String reversed = new StringBuilder(str).reverse().toString();
            int[] answer = reversed.chars().map(c -> c - '0').toArray();

            return answer;
        }
    }
}

// 1. 타입 변경.
// 2. StringBuilder : 문자열을 변경가능하게 해줌.
// 3. reverse : 문자열 뒤집기.
// 4. c -> c - '0' 유니코드 값에서 '0'의 유니코드 값을 빼서 숫자로 바꿈.