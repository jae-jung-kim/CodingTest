class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length < arr2.length){
            return -1;
        } else if(arr1.length > arr2.length){  
            return 1;
        } else{
            int arr1Max = max(arr1);
            int arr2Max = max(arr2);
            
            if(arr1Max > arr2Max){
                return 1;
            } else if(arr1Max < arr2Max){
                return -1;
            } else{
                return 0;
            }
        }
    }
    
    public static int max(int[] arr){
        int arrMax = 0;
        for(int i=0; i<arr.length; i++){
            arrMax+=arr[i];
        }
        return arrMax;
    }
}