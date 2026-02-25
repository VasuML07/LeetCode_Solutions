/*Create a hashset and now iterate through the array if element is already found in hashset
return true if not add the element to hashset*/

Set<Integer> seen = new HashSet<>();
for(int num:nums){
  if(!seen.contains(num)){
    return false;
  }
  seen.add(nums);
}
return false;
