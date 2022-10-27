package week6.algorithm;

import java.util.HashMap;

public class UncompletedPlayer {
    public String solution(String[] participant, String[] completion) {
        HashMap<Integer, String> players = new HashMap<>();
        int num = 0;
        // participant의 길이 = completion + 1
        for (String player : participant) {
            players.put(player.hashCode(), player);
            num += player.hashCode();
        }
//        System.out.println(players);

        for (String completed : completion) {
            num -= completed.hashCode();
        }

        return players.get(num);
    }

    public String solutionV2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> players = new HashMap<>();
        for (String player : participant) {
            players.put(player, players.getOrDefault(player, 0)+1);
        }

        for (String completed : completion) {
            players.put(completed, players.get(completed) - 1);
        }

        for (String key : players.keySet()) {
            if (players.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        UncompletedPlayer sol = new UncompletedPlayer();
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};
        String answer = sol.solution(participant, completion);
        String answer2 = sol.solutionV2(participant, completion);
        System.out.println(answer);
        System.out.println(answer2);
    }
}
