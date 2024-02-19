class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pInt = Long.parseLong(p);
        Long[] tInt = new Long[t.length()-p.length()+1];
        for(int i=0; i<tInt.length; i++){
            tInt[i] = Long.parseLong(t.substring(i,i+p.length()));
        }
        for(Long i:tInt){
            if(i<=pInt){
                answer++;
            }
        }
        return answer;
    }
}