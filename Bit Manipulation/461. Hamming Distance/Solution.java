class Solution {
    public int hammingDistance(int x, int y) {
        // so the ques tell us to find the postion of bits where the bits are different at that postion 
        //  example - 
        //  0 1 0 1 0
        //  1 1 1 0 0
        //  u   u u
        //  you can see 11 and 00 are not unique opp bits are unique now to fin this postions we should xor them when we xor diff value bits get 1 and remaining 0
        //  so for that example if we xor we will get - 1 0 1 1 0, we should count the total number of 1's and return thats it. to count sub with -1 and and them

     int unique = x^y;
     int count = 0;

     while(unique !=0){
         unique = (unique & (unique-1));
         count++;
     }   
     return count;
    }
}