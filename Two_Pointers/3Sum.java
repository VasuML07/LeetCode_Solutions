
/*first sort the array it helps in findng duplicates easily.take a fixed pointer i which
iterates from 0 to n-2 and it be nums[i].skip duplicates cjeck if nums[i-1] and nums[i] are
same or not.next intialize two pointers left and right.left =i+1 and right=n-1.calculate
sum.saame if sum is equal return indices but before to skip duplicates.check it and if 
found increment left for left duplicate for right decrement it.if less increment left.if 
more than target decrement right since we sorted the array*/

List<List<Integer>> result = new ArrayList<>();
Arrays.sort(nums);
int n = nums.length;
for(int i=0;i<n-2;i++){
  if(nums[i]>0){
    break;
  }
  if(i>0 && nums[i] == nums[i-1]){
    continue;
  }
  int left = i+1;
  int right = n-1;
  while(left<right){
    int sum = nums[i]+nums[left]+nums[right];
    if(sum == 0){
      result.add(Arrays.asList(nums[i],nums[left],nums[right]);
      left++;
      right--;
      while(left < right && nums[left] == nums[left-1]){
        left++;
      }
      while(left<right && nums[right] == nums[right-1]){
        right--;
      }
    }else if(sum < 0){
      left++;
    }else{
      right--;
    }
  }
}
return result;

time complexity is o(n^2)
space complexity is o(1)
