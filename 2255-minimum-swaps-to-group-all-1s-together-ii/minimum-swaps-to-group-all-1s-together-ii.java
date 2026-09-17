class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int ones=0;
        for(int num:nums){
            if(num==1) ones++;
        }

        if(ones==n||ones==0) return 0;

        int l=0;
        int zeroes=0,ans=Integer.MAX_VALUE;
        for(int r=0;r<2*n;r++){
            if(nums[r%n]==0) zeroes++;
            
            if(r-l+1>ones){
                if(nums[l%n]==0) zeroes--;
                l++;
            }

            if(r-l+1==ones){
                ans=Math.min(ans,zeroes);
            }
        }
        return ans;
        
    }
}