class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();

        mp.put(0,1);
        int currSum=0, cnt=0;
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            int prevSum=currSum-k;
            if(mp.containsKey(prevSum)){
                cnt+=mp.get(prevSum);
            }
            mp.put(currSum,mp.getOrDefault(currSum,0)+1);            
        }
        return cnt;
    }
}