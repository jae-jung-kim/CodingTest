import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> honors = new ArrayList<>();

        for(int i=0; i<score.length; i++){
            honors.add(score[i]);

            if(honors.size()>k){
                honors.remove(Collections.min(honors));
            }

            answer[i] = Collections.min(honors);
        }
        return answer;
    }
}