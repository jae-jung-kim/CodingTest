import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] xCnt = new int[10];
        int[] yCnt = new int[10];
        for(int i=0; i<X.length(); i++){
            int x = X.charAt(i) - '0';
            xCnt[x]++;
        }
        for(int i=0; i<Y.length(); i++){
            int y = Y.charAt(i) - '0';
            yCnt[y]++;
        }
        
        for(int i=9; i>=0; i--){
            while(xCnt[i]>0 && yCnt[i]>0){
                sb.append(i);
                xCnt[i]--;
                yCnt[i]--;
            }
        }
        String answer = sb.toString();
        if(answer.equals("")){
            return "-1";
        }else if(answer.substring(0,1).equals("0")){
            return "0";
        }else{
            return answer;
        }
    }
}