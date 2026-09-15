class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] q, int x) {
        int n=nums.length;
        int qn=q.length;
        for(int i=0;i<n;i++){
            if(nums[i]==x) nums[i]=1;
            else nums[i]=0;
        }

        int[] pref=new int[n+1];
        for(int i=0;i<n;i++){
            pref[i+1]=pref[i]+nums[i];
        }

        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n+1;i++){ //looping through pref array
            if(!mp.containsKey(pref[i])){
                mp.put(pref[i],i);
            }
        }
        for(int i=0;i<qn;i++){
            if(mp.containsKey(q[i])) q[i]=mp.get(q[i])-1;
            else q[i]=-1;
        }

        return q;
    }
}