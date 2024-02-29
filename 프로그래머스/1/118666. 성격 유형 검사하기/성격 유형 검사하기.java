import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> ps = new HashMap<>();
        String[] psArray = {"R","T","C","F","J","M","A","N"}; //원소를 배열로 표기해주고
        for(String i:psArray){
            ps.put(i,0); //HashMap에 value값 0으로 넣어준다.
        }
        for(int i=0; i<survey.length; i++){
            String[] surveyElement = survey[i].split(""); //suvey[i]의 두 문자를 한 문자씩 배열에 넣어준다.
            if(choices[i]<4){ //choices[i]가 4보다 작으면
                int value = ps.get(surveyElement[0]);
                ps.put(surveyElement[0],value+4-choices[i]); //suvey[i]의 첫번째 문자와 유형 점수를 put
            } else if(choices[i]>4){ //choices[i]가 4보다 크면
                int value = ps.get(surveyElement[1]);
                ps.put(surveyElement[1],value+choices[i]-4); //suvey[i]의 두번째 문자와 유형 점수를 put
            }
        }
        for(int i=0; i<psArray.length; i+=2){ //HashMap에 있는 value값을 비교해서 answer에 넣어줌.
            if(ps.get(psArray[i])>ps.get(psArray[i+1])){
                answer+=psArray[i];
            } else if(ps.get(psArray[i])<ps.get(psArray[i+1])){
                answer+=psArray[i+1];
            } else{
                answer+=psArray[i];
            }
        }
        return answer;
    }
}