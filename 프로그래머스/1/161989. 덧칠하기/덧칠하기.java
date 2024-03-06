class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] paint = new boolean[n];
        for(int i=0; i<section.length; i++){
            paint[section[i]-1] = true;
        }
        for(int i=0; i<paint.length; i++){
            if(paint[i]){
                for(int j=i; j<i+m; j++){
                    if(j<paint.length){
                        paint[j] = false;
                    }else{
                        break;
                    }
                }
                answer++;
                i+=m-1;
            }
        }

        return answer;
    }
}