/*expand around center if present checking single letter dont update length if checking double
letter */

if(s == null || s.length()<1){
  return "";
}
for (int i=0;i<s.length();i++){
  int len1 = expandaroundcenter(s,i,i);
  int len2  =expandaroundcenter(s,i,i+1);
  int maxlen = Math.max(len1,len2);
  if(maxlen >  end-start){
    start = i-(maxlen-1)/2;
    end = i+maxlen/2;
  }
}
return s.substring(start,end+1);
int start = 0;
int end = 0;
private int expandaroundcenter(String s,int left,int right){
  while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
    left++;
    right--;
  }
  return right-left-1;
}
