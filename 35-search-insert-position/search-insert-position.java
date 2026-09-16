class Solution {
    public int searchInsert(int[] nums, int t) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==t){
                return mid;
            } else if(nums[mid]<t){
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return low;

    }
}