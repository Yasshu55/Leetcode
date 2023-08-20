class Solution {
    public int[] evenOddBit(int n) {
        int[] res = new int[2];
        int num = n;
        int even = 0,odd = 0;

        for(int i=0;i<32;i++){
            if(i%2 == 0){
               if((n&1) == 1)
               even++;
            n>>=1;
            }
            else {
                if((n&1)==1)
                odd++;
             n>>=1;   
            }
        }
        res[0] = even;
        res[1] = odd;
        return res;
    }
}