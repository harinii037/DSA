class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] pref=new int[n+1];
        int[] suf=new int[n+1];

        for(int i=0;i<n;i++){
            pref[i+1]=pref[i]+nums[i];
        }

        for(int i=n-1;i>=0;i--){
            suf[i]=suf[i+1]+nums[i];
        }

        for(int i=0;i<n;i++){
            if(pref[i]==suf[i+1]){
                return i;
            }
        }
        return -1;
    }
}