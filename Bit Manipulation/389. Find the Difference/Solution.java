class Solution {
    public char findTheDifference(String s, String t) {
    //  so here in this problem we will use XOR, In XOR if the values are same then it will return 0 and if they are different they will return 1
    // *********Truth table**********
    //    0 0 = 0
    //    0 1 = 1
     //   1 0 = 1
     //   1 1 = 0

    // For Example:- 
    //  4^4 = 0 
    //  0^5 = 5

    //  So now in this problem if we xor all the characters we will get the ans
    //   ex - s=abc, t=bacx 
    //  if we xor s and t we will get but cant do it directly need to do char by char
    //  so convert to char array
    //  a^b^c^b^a^c^x (in xor it will rearrange the values so no dont worry)
    //  a^a^b^b^c^c^x
    //  0^0^0^0^0^0^x
    //  0^x  -> x

    char res = 0;
    for(char c : s.toCharArray()){
        res ^=c;
    }
    for(char c : t.toCharArray()){
        res ^= c;
    }
    return res;

    }
}