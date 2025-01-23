package 프로그래머스코딩테스트.알고리즘.해시;


import java.util.HashMap;

public class 완주하지못한선수 {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            HashMap<String, Integer> rest = new HashMap<>();

            for (String p : participant) {
                rest.put(p, rest.getOrDefault(p, 0) + 1);
            }

            for (String c : completion) {
                rest.put(c, rest.get(c) - 1);
                if(rest.get(c) == 0) {
                    rest.remove(c);
                }
            }

            String answer = "";
            for (String key : rest.keySet()) {
                answer = key;
            }

            return answer;
        }
    }
}


// 요구사항 : 마라톤 선수 탈락한 한명의 선수 이름을 리턴.

// 1. Hash Map <총 인원 이름, 카운트> 생성
// 2. 키 값은 중복이 안되니까 <이름, 카운트>
// 3. getOrDefault 사용
