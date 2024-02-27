import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        ArrayList<Character> sChar = new ArrayList<Character>();
        for(int i=0; i<answer.length; i++){
            if(sChar.contains(s.charAt(i))){ //sChar 리스트에 있으면
                for(int j=i-1; j>=0; j--){ //지금 인덱스(i)보다 작아지면서
                    if(sChar.get(j).equals(s.charAt(i))){ //j번째 인덱스가 sChar배열에 포함되어있으면
                        answer[i] = i-j; //i-j로 근접해있는 만큼 answer[i]에 추가
                        sChar.add(s.charAt(i));
                        break;
                    }
                }
            }else{ //sChar 리스트에 없으면 리스트에 add해주고 answer[i]에다가 -1
                sChar.add(s.charAt(i));
                answer[i] = -1;
            }
        }
        return answer;
    }
}