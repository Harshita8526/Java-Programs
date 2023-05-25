class Solution {
    public int findDuplicate(int[] nums) {
       Set<Integer> list = new HashSet<>();
        for(int a: nums){
            if(list.contains(a)){
                return a;
            }
            else{
                list.add(a);
            }
        }
        return 1;
    }
}
