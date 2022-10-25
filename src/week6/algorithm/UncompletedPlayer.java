package week6.algorithm;

import java.util.HashMap;

public class UncompletedPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<Integer, String> players = new HashMap<>();
        int num = 0;

        for (String player : participant) {
            players.put(player.hashCode(), player);
            num += player.hashCode();
        }
        System.out.println(players);

        for (String completed : completion) {
            num -= completed.hashCode();
        }

        return players.get(num);
    }

    public static void main(String[] args) {
        UncompletedPlayer solution = new UncompletedPlayer();
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};
        String answer = solution.solution(participant, completion);
        System.out.println(answer);
    }
}
