package 프로그래머스코딩테스트.알고리즘.해시;

import java.util.HashSet;

public class 폰켓몬 {
    class Solution {
        public int solution(int[] nums) {
            int maxPick = nums.length / 2;
            HashSet<Integer> kinds = new HashSet<>();

            for (int n : nums) {
                kinds.add(n);
            }

            return maxPick >= kinds.size() ? kinds.size() : maxPick;

        }
    }
}

// 요구사항 : 최대로 고를 수 있는 종류의 개수를 리턴해야한다.

// 1. Hash Map 은 중복을 허용하지 않는다.
// 2. 배열의 값들을 Hash Map 에 넣는다.
// 3. 가질 수 있는 포켓몬 수 n 이라고 한다.
// 4. Hash Map 배열 (중복을 제거한 종류만 남는다) 길이는 k.
// 5. n 이 k 보다 작으면 n 값 리턴.
// 6. n 이 k 보다 크면  k 값 리턴.