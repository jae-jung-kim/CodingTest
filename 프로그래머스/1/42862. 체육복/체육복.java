import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        ArrayList<Integer> lostList = new ArrayList<>();
        ArrayList<Integer> reserveList = new ArrayList<>();
        for(int i:reserve){
            reserveList.add(i);
        }
        for(int i:lost){
            if(reserveList.contains(i)){
                reserveList.remove(reserveList.indexOf(i));
            }else{
                lostList.add(i);
            }
        }
        Collections.sort(lostList);
        Collections.sort(reserveList);
        for(int i=0; i<reserveList.size(); i++){
            if(lostList.contains(reserveList.get(i)-1)){
                lostList.remove(lostList.indexOf(reserveList.get(i)-1));
            } else if(lostList.contains(reserveList.get(i)+1)){
                lostList.remove(lostList.indexOf(reserveList.get(i)+1));
            }
        }
        return n-lostList.size();
    }
}