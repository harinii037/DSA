class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>(); //<rem, index>
        mp.put(0,-1); 
        // here, im not counting or frequency related for it to be 1, rater index  based-> so for 0, which exists before staring the prefixsum -> index is -1

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(mp.containsKey(rem)){
                if(i-mp.get(rem)>1){
                    return true;
                }
            } else {
                mp.put(rem, i); //record only the first occurence of the rem
            }
        }

        return false;

    }
}