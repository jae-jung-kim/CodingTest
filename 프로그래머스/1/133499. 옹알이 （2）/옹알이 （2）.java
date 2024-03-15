class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int i = 0;
        int count = 0;
   

        String[] word= {"aya","ye","woo","ma"};
        for(String item: babbling){
            for(String wd : word){
                if(item.contains(wd+wd)){
                    continue;    
                }
                item = item.replaceAll(wd," ");
                                
            }
            item = item.replaceAll(" ","");
            if(item.isEmpty()){
                count++;                
            }
          
        }
        answer = count;
        return answer;
    }
}