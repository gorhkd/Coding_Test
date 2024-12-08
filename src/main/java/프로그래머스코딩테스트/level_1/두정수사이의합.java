package 프로그래머스코딩테스트.level_1;


import java.util.stream.IntStream;

public class 두정수사이의합 {
    class Solution {
        public long solution(int a, int b) {
            return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).mapToLong(i -> (long) i).sum();
        }
    }
}
// 1. return (a <= b) ? IntStream.rangeClosed(a, b).sum() : IntStream.rangeClosed(b, a).sum();
// 2. return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();

// rangeClosed(a, b) : a ~ b 사이에 값을 만들어줌
// sum() : 총합

// 3.
//    long sum = 0;
//    int max = Math.max(a, b);
//    int min = Math.min(a, b);
//
//    while(min <= max){
//            sum += min;
//            min++;
//    }
//    return sum;