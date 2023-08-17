public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0, bit;

        for(int i=0;i<=31;i++){
            bit = (n>>i) & 1;
            result = result | bit<<(31-i);
        }

        return result;
    }
}