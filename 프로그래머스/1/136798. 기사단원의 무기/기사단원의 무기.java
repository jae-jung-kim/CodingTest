import java.util.*;

class Solution {
    int[] primeNumber = {};
    public int solution(int number, int limit, int power) {
        primeNumber = new int[number+1];
        for (int i = 1; i <= number; i++) {
            findDivision(i,1);
        }
        for(int i=0; i<primeNumber.length; i++){
            if(primeNumber[i]>limit){ //배열의 각 원소가 limit보다 커지면
                primeNumber[i]=power; //파워 넣어주기
            }
        }
        return Arrays.stream(primeNumber).sum();
    }
    
    private void findDivision(int num, int i) {
        if(i > Math.sqrt(num)) {
            return;
        }

        if(Math.sqrt(num) == i) {
            primeNumber[num - 1] += 1;
        } else if (num % i == 0) {
            primeNumber[num - 1] += 2;
        }

        findDivision(num, i+1);
    }
}