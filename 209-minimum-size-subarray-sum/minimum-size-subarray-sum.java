class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int n=nums.length;
        int l=0;
        int minLen=Integer.MAX_VALUE;
        int sum=0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>=t){
                minLen=Math.min(minLen, r-l+1);
                sum-=nums[l];
                l++;
            }
            
        }
        if(minLen==Integer.MAX_VALUE){
            return 0;
        }
        return minLen;

    }
}