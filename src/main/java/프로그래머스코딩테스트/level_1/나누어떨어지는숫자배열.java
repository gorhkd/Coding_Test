package 프로그래머스코딩테스트.level_1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class 나누어떨어지는숫자배열 {

    class Solution {
        public int[] solution(int[] arr, int divisor) {
            List<Integer> answer = new ArrayList<>();

            for (int a : arr) {
                if (a % divisor == 0) {
                    answer.add(a);
                }
            }

            if (answer.isEmpty()) {
                return new int[]{-1};
            } else {
                return answer.stream()
                        .sorted()
                        .mapToInt(Integer::intValue)
                        .toArray();
                }
            }
        }


//    class Solution {
//        public int[] solution(int[] arr, int divisor) {
//            int[] answer = Arrays.stream(arr)
//                    .filter(e -> e % divisor == 0)
//                    .sorted()
//                    .toArray();
//            return answer.length != 0 ? answer : new int[]{-1};
//            }
//        }

    }

