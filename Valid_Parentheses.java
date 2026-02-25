/*we will determibe if a string of brackets is valid parentheses .
every poening bracket should be closed.brackets should be in correct order.Lets use stack because 
for correct order of opening*/

if(s.length()%2 !=0){
  return false;
}
Stack<character> stack =new Stack<>();
Map<Character,Character> pairs = new HashMap<>();
pairs.put(')','(');
pairs.put('}','{');
pairs.put(']','['');
for(char c:s.toCharArray()){
  if(pairs.containsKey(c)){
    if(stack.isEmpty() || stack.pop() != pairs.get(c)){
      return false;
    }
  }else{
    stack.push(c);
  }
}
return stack.isEmpty();
      
