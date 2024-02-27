import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> totalKeymap = new HashMap<Character, Integer>();
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char c = keymap[i].charAt(j); //i번째 단어에 j번째 글자
                if (totalKeymap.containsKey(c)) {
                    totalKeymap.put(c, Math.min(totalKeymap.get(c), j + 1)); //같은 문자비교할때 value값이 더 작은 거를 put
                } else {
                    totalKeymap.put(c, j + 1); //같은 문자가 없으면 HashMap에 put
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            char[] target = targets[i].toCharArray(); //i번째 target을 char배열로 바꿈
            boolean flag = true;
            int count = 0; //value값 세기 
            for (char c : target) {
                if (totalKeymap.containsKey(c)) { //totalKeymap의 key값에 c가 포함되어있으면
                    count += totalKeymap.get(c); //c의 value값을 count에 ++
                } else {
                    flag = false; //c가 포함되어있지않으면
                    break;
                }
            }
            if (flag) {
                answer[i] = count;
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}