class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        double maxi=sum/k;

        int l=0;
        for(int r=k;r<n;r++){
            sum+=nums[r];
            if(r-l+1>k){
                sum-=nums[l];
                l++;
            }

            if(r-l+1==k){
                maxi=Math.max(maxi,sum/k);
            }
        }
        return maxi;
    }

}