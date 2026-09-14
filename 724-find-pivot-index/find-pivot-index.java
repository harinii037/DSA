class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] pref=new int[n+2];
        for(int i=0;i<n;i++){
            pref[i+1]=pref[i]+nums[i];
        }
        int total=pref[n];
        for(int i=0;i<n;i++){
            int ls=pref[i];
            int rs=total-pref[i+1];
            if(ls==rs) return i;
        }
        return -1;
    }
}