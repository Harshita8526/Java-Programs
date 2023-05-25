class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> l=new LinkedList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || i>0 && nums[i]!=nums[i-1]){
                int left=i+1,r=nums.length-1,sum=0-nums[i];
                while(left<r){
                    if(nums[left]+nums[r]==sum){
                       l.add(Arrays.asList(nums[i],nums[left],nums[r]));   
                    

                    while(left<r && nums[left]==nums[left+1]){
                           left++;
                    }
                    while(left<r && nums[r]==nums[r-1]){
                           r--;
                    }
                    left++;
                    r--;
                    }
            
            else if(nums[left]+nums[r]<sum){
                left++;
            }
            else{
                r--;
            }
                }

            }
        }
        return l;
    }
}
