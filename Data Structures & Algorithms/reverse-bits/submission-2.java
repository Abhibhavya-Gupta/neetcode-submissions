class Solution {
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<=31;i++){
            int bit= 1 & n;
            n = n>>1;
            res = res | (bit<<(31-i));
        }
        return res;
    }
}
