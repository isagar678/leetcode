class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int count=0;
        if (n==1) return true;
       for(int i=0;i<2*n;i++){
        if(nums[i%n]<=nums[(i+1)%n]) count++;
        else count=0;
        if(count==n-1) return true;

       }
       return false;
    }
}