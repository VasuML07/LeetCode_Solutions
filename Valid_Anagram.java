/*Anagrams contain the same characters with same frequencies.
First check lengths of 2 strings if same
let us use frequency array of size 26 to track char counts of 2 strings
increment count of chars while looping the chars of string*/

if(s.length() != t.length(){
  return false;
}
int[] count = new int[26];
for(int i=0;i<s.length();i++){
  count[s.charAt(i)-'a']++;
  count[t.charAt(i)-'a']--;
}
for(int i:count){
  if(i != 0){
   return false;
  }
}

  
