/*first let us sort the array to get good implementation of pointers.lets use nested loop for 
first 2 numbers fix i for 1st no and j for 2nd no.if  sum of smalllest possible 4 numbers is 
greater than target break it.if it is less than target continuet to move i.for remaining 2 numbers lets 
use left and right as pointers.intialize left=j+1 and right = n-1.calculate sum and based of that
move the pointers.also skip duplicate values.*/

List<List<Integer> result = new ArrayList<>();
int n = nums.length;
if(n<4){
  return result;
}
Arrays.sort(nums);
for(int i=0;i<n-3;i++){
  if(i>0 && nums[i] == nums[i-1]){
    continue;
  }
  if((long) nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target){
    break;
  }
  if((long) nums[i]+nums[n-3]+nums[n-2]+nums[n-1]<target){
    continue;
  }
  for(int j=i+1;j<n-2;j++){
    if(j>i+1; && nums[j] == nums[j-1]){
      continue;
    }
    if((long) nums[i]+nums[j]+nums[j+1]+nums[j+2] > target ){
      break;
    }
    if((long) nums[i]+ums[j]+nums[n-2]+nums[n-1] < target){
      conntinue;
    }
    int left = j+1;
    int right = n-1;
    while(left < right){
      long sum  = (long) nums[i]+nums[j]+nums[left]+nums[right];
      if(sum == target){
        result.add(Array.asList(nums[i],nums[j],nums[left],nums[right]);
      }
      while(left<right && nums[left] == nums[left-1]){
        left++;
      }
      while(left<right && nums[right] == nums[right-1]){
        right--;
      }
      left++;
      right--;
    }
    elseif(sum < target){
      left++;
    }
    else{
      right--;
    }
  }
}
return result;
