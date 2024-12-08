package 프로그래머스코딩테스트.level_3;

public class 정수삼각형_동적계획법 {
    class Solution {
        public int solution(int[][] triangle) {

            int answer;

            for(int i = triangle.length - 2; i >= 0; i--) {
                for (int j = 0; j < triangle[i].length; j++) {
                    triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
                }
            }
            return triangle[0][0];
        }
    }
}
// 1. int[i][j] i = 배열 길이 만큼 반복, j = j는 다음 인덱스에서 j 또는 j + 1 로만 이동 가능.
// 2. 2차 배열.. 순회? 정직하게 다 순회해서 도움이 안될거같다.
// 3. j 값은 순회한 후 다른 경우의 수를 이동.
// 4. 부분적으로 for문을 쓰면 끝도 없을거 같고.. j가 모든 경우의 수를 조건 안에서 확인할 수 있는 메서드.
// 5. 그 중 가장 큰 값을 제출...
// 포기 내 부족한 지식으로는 아직 못푼다! 채찍피티한테 힌트만 달라해야지
// 동적 계획법 공부해서 풀이! (뭔가 미로를 출구에서 입구로 이동하는 느낌이네)

