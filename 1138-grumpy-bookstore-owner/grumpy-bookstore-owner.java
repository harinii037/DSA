class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int base=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                base+=customers[i];
            }
        }
        int sum=0; // sum -> customers who are unsatisfied and are inside our window
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                sum+=customers[i];
            }
        }
        int maxi=sum;
        int l=0;
        for(int r=minutes;r<n;r++){
            if(grumpy[r]==1){
                sum+=customers[r];
            }

            if(r-l+1 > minutes){
                if(grumpy[l]==1){
                    sum-=customers[l];
                }
                l++;
            }

            maxi=Math.max(maxi, sum);
            
        }
        return base+maxi;
    }
}