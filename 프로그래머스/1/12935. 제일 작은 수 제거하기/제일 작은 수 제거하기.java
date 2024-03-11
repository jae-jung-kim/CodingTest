import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            return new int[]{-1};
        }
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i:arr){
            arrList.add(i);
        }
        arrList.remove(Collections.min(arrList));
        int[] answer = new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}