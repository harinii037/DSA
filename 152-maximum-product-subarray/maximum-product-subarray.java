class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxP=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=i;j<n;j++){
                p*=nums[j];
                maxP=Math.max(maxP,p);
            }
        }
        return maxP;
    }
}