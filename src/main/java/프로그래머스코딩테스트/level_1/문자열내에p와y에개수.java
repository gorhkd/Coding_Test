package 프로그래머스코딩테스트.level_1;

import java.util.List;
import java.util.Locale;

public class 문자열내에p와y에개수 {
    class Solution1 {
        boolean solution(String s) {
            boolean answer = true;
            int count_P = 0;
            int count_Y = 0;
            String[] strList = s.toLowerCase().split("");

            for (int i = 0; i < strList.length; i++) {
                if (strList[i].equals("p")) {
                    count_P++;
                } else if (strList[i].equals("y")) {
                    count_Y++;
                }
            }

            if (count_P == 0 && count_Y == 0) {
                return true;
            }

            return count_P == count_Y ? true : false;
        }
    }


// 1. p 와 y 모두 없다면 True
// 2. p 와 y 개수가 같다면 True
// 3. p 와 y 개수가 다르면 False

// 0. 모두 소문자나 대문자로 변환.
// 1. 문자열을 배열에 넣는다.
// 2. p 와 y 의 개수를 각각 카운트를 센다.
// 3. 결과를 반환한다.


// 챗취피티 피드백
// 1. 불필요한 split  2. 불필요한 삼항 연산자  3. toLowerCase 처리

    class Solution2 {
        boolean solution(String s) {
            int count_P = 0;
            int count_Y = 0;

            s = s.toLowerCase();

            for (char c : s.toCharArray()) {
                if (c == 'p') {
                    count_P ++;
                } else if(c == 'y'){
                    count_Y++;
                }
            }

            return count_P == count_Y || (count_P == 0 && count_Y == 0);
        }
    }
}