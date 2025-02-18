package 프로그래머스코딩테스트.알고리즘.스택큐;


public class 올바른괄호 {
    class Solution {
        boolean solution(String s) {
            int num = 0;
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                if(c == '('){
                    num ++;
                } else {
                    num --;
                }

                if (num < 0) {
                    return false;
                }
            }
            return num == 0;
        }
    }
}
