package 프로그래머스코딩테스트.level_0;

public class 배열자르기 {
    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2 - num1 + 1];
            int inc = 0;

            for(int i = num1; i <= num2; i++){
                answer[inc] = numbers[i];
                inc++;
            }
            return answer;

          //  return Arrays.copyOfRange(numbers, num1, num2);
        }

    }
}