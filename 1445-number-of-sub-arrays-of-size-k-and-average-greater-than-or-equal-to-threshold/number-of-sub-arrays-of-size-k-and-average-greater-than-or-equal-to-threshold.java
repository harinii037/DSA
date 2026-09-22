class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int sum=0, cnt=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum/k >= threshold) cnt++;

        int l=0;
        for(int r=k;r<n;r++){
            sum+=arr[r];

            if(r-l+1>k){
                sum-=arr[l];
                l++;
            }

            if((r-l+1 == k) && (sum/k >= threshold)){
                cnt++;    
            }
        }
        return cnt;
    }
}