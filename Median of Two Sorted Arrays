
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      //  int t=
      int n=nums1.length+nums2.length;
        int [] a= new int[n];
        for(int i=0;i<nums1.length;i++){
            a[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            a[nums1.length+i]=nums2[i];
        }

        Arrays.sort(a);
        int s=0;int e=a.length-1;
        int mid=s+(e-s)/2;
        int x=n%2;
        double res;
        if(x!=0){
            res=a[mid];
        }
        else{
            int q=a.length/2;
            res=(a[q-1]+a[q])/2.0;
        }
           
            
        return res;
    }
}










