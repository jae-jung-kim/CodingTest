import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                a.add(i);
            }
        }
        Collections.sort(a);
        if (a.isEmpty()) {
            return new int[]{-1};
        }
        int[] answer = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }
        return answer;
    }
}