import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int[] maxArray = new int[sizes.length];
        int[] minArray = new int[sizes.length];
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                maxArray[i] = sizes[i][0];
                minArray[i] = sizes[i][1];
            }else{
                maxArray[i] = sizes[i][1];
                minArray[i] = sizes[i][0];
            }
        }
        int max = Arrays.stream(maxArray).max().orElse(0);
        int min = Arrays.stream(minArray).max().orElse(0);
        return max*min;
    }
}