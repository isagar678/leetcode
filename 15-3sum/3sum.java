class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int low; int mid; int high;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        low=i+1;
        high=nums.length-1;
        if (i > 0 && nums[i] == nums[i - 1]) continue;

        while(low<high){
            if(nums[low]+nums[high]+nums[i]==0){
                ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
                low++;
            high--;
               while (low < high && nums[low] == nums[low - 1]) low++;
            while (low < high && nums[high] == nums[high + 1]) high--;
                
             
            }
            else if(nums[low]+nums[high]+nums[i]<0){
               low++;
            }
            else{
                   high--;
                
            }

        }
     } 
     return ans;  
    }
}