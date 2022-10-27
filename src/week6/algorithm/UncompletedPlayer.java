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

    public static void main(String[] args) {
        UncompletedPlayer sol = new UncompletedPlayer();
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};
        String answer = sol.solution(participant, completion);
        System.out.println(answer);
    }
}
