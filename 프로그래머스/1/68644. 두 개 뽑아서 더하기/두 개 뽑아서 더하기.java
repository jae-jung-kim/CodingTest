import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> answerSet = new HashSet<>(); //중복이 있으면 안돼서 Set사용
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                answerSet.add(numbers[i]+numbers[j]);
            }
        }
        ArrayList<Integer> answerList = new ArrayList<>(answerSet); //Set은 정렬이 안돼서 ArrayList로 바꿔주고
        Collections.sort(answerList); //정렬
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}