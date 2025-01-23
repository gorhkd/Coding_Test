package 프로그래머스코딩테스트.알고리즘.해시;

import java.util.HashMap;

public class 의상 {
    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            HashMap<String, Integer> categoryCount = new HashMap<>();

            for(String[] c : clothes){
                String category = c[1];
                categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
            }

            for (Integer count : categoryCount.values()) {
                answer *= (count + 1);
            }

            return answer - 1;
        }
    }
}

// 요구사항 : 입을 수 있는 옷의 경우의 수를 리턴.
// 한 부위에 하나만 착용 가능.

// 1. 부위 카테고리로 Key 값 설정.
// 2. 부위 마다 개수를 Value 로 설정.
// 3. 부위가 중복되지 않게 모든 경우의 수를 찾음.
// 모든 경우의 수는 각 밸류(개수)를 합하고, 두개 이상의 키를 곱하고 더한다.
// 하나만 착용 가능, 서로 다른 부위 같이 착용 가능.

// 이해하기 어려운 부분  => 총 경우의 수를 구하는 공식
//          answer *= (각 종류 마다의 경우의 수 + 1)      answer - 1;
// 각 경우의 수 마다 안입는다 라는 경우가 있기 때문에 + 1
// 모든 경우의 수를 곱한다. (그러면 아무것도 안입는 경우의 수가 한개 생김)
// 총 경우의 수에서 아무것도 안입는 경우의 수를 없애기 위해 - 1 한다.