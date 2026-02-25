nums = [2,7,11,15], target = 9
Lets Create a hashmap to store all values
Lets iterate through hashmap and subract the element from target we get a value
Let it be complement.
We will check if complement exists in hashmap.
If exists we get the index of the element we will store it.

Core Code:

Map<Integer,Integer> map = new HashMap<>(){
 for(int i=0;i<nums.length;i++){
   int complement = target-nums[i];
   if(map.containsKey(complement)){
    return int[] {map.get(complement),i};
  }
  //if not present
  map.put(nums[i],i);
}
throw new IllegalArgumentException("No two sum solution");
