class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> l=new LinkedList<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                   if(nums[i]==nums[j]){
                      l.add(nums[i]);
                      break;
                   }
            }
        }
        return l;
    }
}
