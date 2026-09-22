class Solution {
    boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int n=s.length();
        int cnt=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                cnt++;
            }
        }
        int maxCount=cnt;

        int l=0;
        for(int r=k;r<n;r++){
            char ch=s.charAt(r);
            if(isVowel(ch)) cnt++;

            if(r-l+1>k){
                if(isVowel(s.charAt(l))) cnt--;
                l++;
            }

            if(r-l+1==k){
                maxCount=Math.max(maxCount, cnt);
            }
        }
        return maxCount;
    }
}