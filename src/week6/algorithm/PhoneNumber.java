package week6.algorithm;

import java.util.HashSet;

public class PhoneNumber {
    // Set의 탐색속도는 O(1)
    // 전화번호의 최대길이는 20
    // 시간복잡도는 O(20N)
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashSet<String> hs = new HashSet<>();

        for (String phoneNum : phone_book) {
            hs.add(phoneNum);
        }

        for (String phoneNum : phone_book) {
            for (int i = 1; i < phoneNum.length(); i++){
                if (hs.contains(phoneNum.substring(0, i))) {
                    answer = false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] phoneBook = {"119", "97674223", "1195524421"};
        PhoneNumber sol = new PhoneNumber();
        System.out.println(sol.solution(phoneBook));
    }
}
