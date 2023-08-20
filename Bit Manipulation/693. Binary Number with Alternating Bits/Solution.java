class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            //get the last bit
            int a = (n&1);

            // right shift the last bit 
            n = n>>1;

            // get the second last bit 
            int b = (n&1);

            // compare both the bits
            if(a==b){
                return false;
            }
        }
        return true;
    }        
}