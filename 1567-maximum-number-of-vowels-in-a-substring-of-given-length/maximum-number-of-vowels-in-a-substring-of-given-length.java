class Solution {
    boolean isVowel(char ch){
        return "aeiou".indexOf(ch) != -1;
    }
    public int maxVowels(String s, int k) {
        int count =0, max=0, left=0 ;
        for(int i=0; i<k; i++){
           char ch = s.charAt(i);
           if(isVowel(ch))
           count++;
        }
        max= count;
        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
             
              count++;
        }
        if(isVowel(s.charAt(i-k))){
            count--;
        }
        max=Math.max(max,count);
        }
            return max;
    }
}