class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int remove = 0;
        int count = 0;
        while(!(s.length()==1)){
            int beforeSLen = s.length();
            s = s.replaceAll("0","");
            int afterSLen = s.length();
            remove += beforeSLen-afterSLen;
            s = Integer.toBinaryString(afterSLen);
            count++;
        }
        answer = new int[]{count,remove};
        return answer;
    }
}