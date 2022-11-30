package week11.algorithm;

public class PAndY {
    boolean solution(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') cnt += 1;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') cnt -= 1;
        }

        if (cnt != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        PAndY sol = new PAndY();
        boolean rst1 = sol.solution("pPoooyY");
        boolean rst2 = sol.solution("Pyy");
        System.out.println("rst1 = " + rst1);
        System.out.println("rst2 = " + rst2);
    }
}
