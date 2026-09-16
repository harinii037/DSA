class Solution {
    public int firstOcccurance(int[] nums, int t){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==t){
                ans=mid;
                high=mid-1;
            } else if(nums[mid]<t){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return ans;
    }

    public int lastOcccurance(int[] nums, int t){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==t){
                ans=mid;
                low=mid+1;
            } else if(nums[mid]<t){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int t) {
        return new int[]{firstOcccurance(nums,t), lastOcccurance(nums,t)};
    }
}