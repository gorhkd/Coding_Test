package 프로그래머스코딩테스트.알고리즘.해시;


import java.util.Arrays;

public class 전화번호목록 {
    class Solution {
        public boolean solution(String[] phone_book) {
            Arrays.sort(phone_book);

            for (int i = 1; i < phone_book.length; i++) {
                if(phone_book[i].startsWith(phone_book[i - 1])){
                    return false;
                }
            }

            return true;
        }
    }
}

// 요구사항 : 배열에 접두사가 있으면 false 없으면 true
// 1. String 을 정렬하면 사전식 정렬 방식으로 정렬.
// 2. startsWith() => 접두사, 포함되어 있으면 true, 아니면 false 매서드

