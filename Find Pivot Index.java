class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }

        int l=0;
        int r=sum;
        for(int i=0;i<nums.length;i++){
            r=r-nums[i];
             if(r==l){
                 return i;
             }
             l=l+nums[i];
    }
        return -1;
}
}
