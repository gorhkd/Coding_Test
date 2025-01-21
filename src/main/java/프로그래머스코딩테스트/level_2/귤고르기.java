package 프로그래머스코딩테스트.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 귤고르기 {
    class Solution {
        public int solution(int k, int[] tangerine) {
            int answer = 0;
            int size = 0;
            int count = 0;
            List<Integer> list = new ArrayList<>();
            Arrays.sort(tangerine);


            for(int i = 1; i < tangerine.length; i++){
                count++;
                if(tangerine[i] != tangerine[i - 1]){
                    list.add(count);

                }
            }

            return answer;
        }
    }
}
// 1. 2차 배열로 크기와 개수를 분류.
// 2. 각 귤의 크기 중 개수가 제일 많은거 부터 내림차순으로 순회.
// 3. 제일 많은 개수부터 k 개수를 채울때까지 순회.
// 4. k개수를 채우면 카운트 리턴.


// 1. 1부터 순차적으로 배열에 넣는다.
// 2. 배열을 순회해서 제일 큰 값을 넣고, k값이 안채워지면 큰값을 0으로 만들고 다음 큰을 넣는다.
// 3. k가 채워지면 브레이크.
