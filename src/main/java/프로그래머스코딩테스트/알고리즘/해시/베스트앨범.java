package 프로그래머스코딩테스트.알고리즘.해시;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 베스트앨범 {
    class Solution {
        public int[] solution(String[] genres, int[] plays) {

            HashMap<String, Integer> genreTotalPlays = new HashMap<>();
            for (int i = 0; i < genres.length; i++) {
                genreTotalPlays.put(genres[i], genreTotalPlays.getOrDefault(genreTotalPlays, 0) + plays[i]);
            }

            Map<String, List<int[]>> songsByGenre = new HashMap<>();
            for (int j = 0; j < genres.length; j++) {
                songsByGenre.putIfAbsent(genres[j], new ArrayList<>());
                songsByGenre.get(genres[j]).add(new int[]{j, plays[j]});
            }

            for (String genre : songsByGenre.keySet()) {
                songsByGenre.get(genre).sort((a, b) -> b[1] == a[1] ? a[0] - b[0] : b[1] - a[1]);
            }

            List<String> sortedGenres = new ArrayList<>(genreTotalPlays.keySet());
            sortedGenres.sort((a, b) -> genreTotalPlays.get(b) - genreTotalPlays.get(a));

            List<Integer> bestAlbum = new ArrayList<>();
            for (String genre : sortedGenres) {
                List<int[]> songs = songsByGenre.get(genre);
                for (int i = 0; i < Math.min(songs.size(), 2); i++) {
                    bestAlbum.add(songs.get(i)[0]);
                }
            }

            return bestAlbum.stream().mapToInt(i -> i).toArray();


        }
    }
}
