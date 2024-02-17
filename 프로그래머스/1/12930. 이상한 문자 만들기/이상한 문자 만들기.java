class Solution {
    public String solution(String s) {
        int index = 0;
        String[] A = s.split("");
        for(int i=0; i<A.length; i++){
            if(A[i].equals(" ")){
                index = 0;
            }else if(index%2==0){
                A[i]=A[i].toUpperCase();
                index++;
            }else{
                A[i]=A[i].toLowerCase();
                index++;
            }
        }
        StringBuilder answer = new StringBuilder();
        for(String i:A){
            answer.append(i);
        }
        return answer.toString();
    }
}