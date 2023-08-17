public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int res = 0,count=0,bit;
        for(int i= 0;i<=31;i++){
            bit = (n>>i) & 1;
            if(bit == 1)
            count++;
        }
        return count;
    }
}