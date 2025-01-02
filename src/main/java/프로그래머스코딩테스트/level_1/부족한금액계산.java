package 프로그래머스코딩테스트.level_1;

public class 부족한금액계산 {
    class Solution {
        public long solution(int price, int money, int count) {
            long answer = -1;
            long sum = 0;
            int num = price;

            for(int i = 1; i <= count; i++){
                sum += price;
                price += num;
            }

                answer = sum - money;
                if(answer < 0){
                    answer = 0;
                }

            return answer;
        }
    }
}
