class Solution {
    public int lengthOfLongestSubstring(String s) {
     List<Character> arr=new ArrayList<>();
     int mc=0,c=0,p=1;
     for(int i=0;i<s.length();i++){
         if(arr.contains(s.charAt(i))){
             mc = c>mc ? c:mc;
             c=0;
             i=p;
             p=p+1;
           arr=new ArrayList<>();
         }
         c++;
             arr.add(s.charAt(i));
     }
     return c>mc ? c:mc;
    }
}
