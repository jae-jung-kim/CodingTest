import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArray = s.split(" ");
        Integer[] sIntArray = new Integer[sArray.length];
        for(int i=0; i<sIntArray.length; i++){
            sIntArray[i] = Integer.parseInt(sArray[i]);
        }
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(sIntArray));
        answer += Collections.min(a);
        answer += " ";
        answer += Collections.max(a);
        return answer;
    }
}