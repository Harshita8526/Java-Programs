class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i = 0;i<n-m+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(needle.equals(haystack.substring(i,i+m))){
                    return i;
                }
            }
        }
        return -1;
    }
}
