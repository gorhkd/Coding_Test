package 프로그래머스코딩테스트.level_1;


import java.util.Arrays;

public class 제일작은수제거 {
    class Solution {
        public int[] solution(int[] arr) {

            if (arr.length <= 1) {
                return new int[]{-1};
            }

            int min = arr[0];
            int minIndex = 0;

            for (int j = 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    minIndex = j;
                    min = arr[j];
                }
            }

            int[] answer = new int[arr.length - 1];
            int k = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i != minIndex) {
                    answer[k] = arr[i];
                    k++;
                }
            }
            return answer;
        }

    }

    class SolutionAI {
        public int[] chapHGPT(int[] arr){
            if(arr.length <= 1){
                return new int[]{-1};
            }

            int min = Arrays.stream(arr).min().getAsInt();

            return Arrays.stream(arr).filter(v -> v != min).toArray();
        }

    }








}
