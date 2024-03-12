import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> nList = new ArrayList<>();

        while (n!=0) {
            nList.add(n % 3);
            n /= 3;
        }
        Collections.reverse(nList);
        int mul = 1;
        for (int i = 0; i <nList.size(); i++) {
            answer += nList.get(i) * mul;
            mul *= 3;
        }
        return answer;
    }
}