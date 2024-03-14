import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int[] primeNumber = new int[number+1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if(j==Math.sqrt(i)){
                    primeNumber[i-1] ++;
                }
                else if (i % j == 0) {
                    primeNumber[i-1] += 2;
                }
            }
        }
        for(int i=0; i<primeNumber.length; i++){
            if(primeNumber[i]>limit){
                primeNumber[i]=power;
            }
        }
        return Arrays.stream(primeNumber).sum();
    }
}