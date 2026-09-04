class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s1 = strs[0];
        for(int i=1; i<strs.length; i++){
            int j=0;
            while(j<s1.length() && j<strs[i].length() && s1.charAt(j) == strs[i].charAt(j)){
                j++;
            }
            s1=s1.substring(0, j);
            if(s1.length() == 0){
                return "";
            }
        }
        return s1;
    }
}