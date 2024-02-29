import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> hamburger = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            hamburger.push(ingredient[i]);
            if (hamburger.size() >= 4
                    && hamburger.get(hamburger.size() - 1) == 1
                    && hamburger.get(hamburger.size() - 2) == 3
                    && hamburger.get(hamburger.size() - 3) == 2
                    && hamburger.get(hamburger.size() - 4) == 1) {
                answer++;
                hamburger.pop();
                hamburger.pop();
                hamburger.pop();
                hamburger.pop();
            }
        }
        return answer;
    }
}