class Solution {
    public boolean isValid(String s) {
        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}'){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(cur == '(' || cur == '[' || cur == '{'){
                stack.push(cur);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char comp = stack.pop();
                if(cur == ')'){
                    if(comp != '('){
                        return false;
                    }
                } else if(cur == '}'){
                    if(comp != '{'){
                        return false;
                    }
                } else if(cur == ']'){
                    if(comp != '['){
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
