class Solution {
    public int[] decode(int[] encoded, int first) {
        // if a^b = c
        // then a = c^b

      /*
      If we have the following:
`       a ^ b = c
        and we need to find b

    do the steps:

            xor both sides
            a ^ b ^ a = c ^ a
        use commutativity property of xor
            a ^ a ^ b = c ^ a
        we know that a ^ a = 0 and 0 ^ b = b
            b = c ^ a
            so, b = c ^ a
       */

        int[] res = new int[encoded.length+1];
        res[0] = first;
        for(int i=0;i<encoded.length;i++){
            res[i+1] = res[i]^encoded[i];
        }
        return res;
    }
}