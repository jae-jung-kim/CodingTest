import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String> sList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            sList.add(String.valueOf(s.charAt(i)));
        }
        Collections.sort(sList);
        Collections.reverse(sList);
        for (int i = 0; i < sList.size(); i++) {
            answer += sList.get(i);
        }
        return answer;
    }
}