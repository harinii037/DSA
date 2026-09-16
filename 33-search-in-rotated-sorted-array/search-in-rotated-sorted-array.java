class Solution {
    int binarySearch(int[] nums,int t, int low, int high){
        int n=nums.length;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==t) {
                ans=mid;
                return mid;
            }
            else if(nums[mid]<t){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int search(int[] nums, int t) {
        int n=nums.length;
        int idx=-1;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                idx=i-1;
                break;
            }
        }

        int ans= binarySearch(nums, t, 0, idx);
        if(ans==-1){
            ans=binarySearch(nums, t, idx+1, n-1);
        }
        return ans;
    }
}