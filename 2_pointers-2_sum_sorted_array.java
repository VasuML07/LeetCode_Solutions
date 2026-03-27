here the array is already sorted we need to return the indices of the numbers in sorted array whose sum should be equal to target.
and the index of 1st number should be less then 2nd number whose sum is equaling to target.
and here the array is 1-indexed so the index starts from 1

Code:

int left=0;
int right=numbers.length-1;
int res[] = new int[2];
while(left<right){
  int sum = numbers[left]+numbers[right];
  if(sum==target){
    result[0]=left+1;
    result[1]=right+1;
    return result;
  }else if(sum<target){
    left++;
  }else{
    right--;
  }
}
return result;

space complexity is o(1) because fixed length array and integers are intialized
time complexity is o(n) beacuse a while loop 
