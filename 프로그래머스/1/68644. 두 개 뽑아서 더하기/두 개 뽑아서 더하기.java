import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> answerSet = new HashSet<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                answerSet.add(numbers[i]+numbers[j]);
            }
        }
        ArrayList<Integer> answerList = new ArrayList<>(answerSet);
        Collections.sort(answerList);
        Integer[] answerArray = answerList.toArray(new Integer[answerList.size()]);
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = answerArray[i];
        }
        return answer;
    }
}