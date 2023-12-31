class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();  

        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.add(c);
            }
            else{
                if(c==')'){
                if(stack.isEmpty() || stack.pop() != '('){
                   return false;
                  }
                }
                 if(c==']'){
                if(stack.isEmpty() || stack.pop() != '['){
                   return false;
                  }
                }
                 if(c=='}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                   return false;
                  }
                }
            }
        }

        return stack.isEmpty()?true:false;
    }
}