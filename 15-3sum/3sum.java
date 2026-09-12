class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> track = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int ele=-(nums[i]+nums[j]);
                if (track.contains(ele)) {
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(ele);
                    Collections.sort(ls);
                    s.add(ls);
                }
                track.add(nums[j]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>(s);
        return ans;

    }
}