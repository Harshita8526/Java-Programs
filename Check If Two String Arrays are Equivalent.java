class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="";
        String b="";

        for(String i :word1){
              a=a+i;
        }

        for(String j :word2){
              b=b+j;
        }

       // return a.toString().equals(b.toString()); working fine
         return a.equals(b);                        //working fine

    }
}
      
