class Solution {
    public int getSum(int a, int b) {
      while(b!=0){
          int temp = (a&b)<<1; // bcoz we need this a to and not the new one (neetcode)
          a = a^b;
          b = temp;
      }
      return a;
    }
}