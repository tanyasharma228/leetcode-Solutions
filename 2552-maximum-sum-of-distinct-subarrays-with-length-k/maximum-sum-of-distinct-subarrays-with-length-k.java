class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> Set =new HashSet<>();
      long sum=0, max=0;
      int left=0;
      for(int i=0; i<nums.length;i++){
       
            while(Set.contains(nums[i])){
                Set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            Set.add(nums[i]);
            sum += nums[i];
            if(Set.size()==k){
                max= Math.max(sum, max);
                Set.remove(nums[left]);
                sum -= nums[left];
                left++;
        }
      }
     return max;
    }
}