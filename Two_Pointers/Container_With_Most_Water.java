/*we need to find area of water contained b/w 2 lines defined by 
Area = min(height[left],height[right])*(right-left)
tom maximize it start left with 0 and right with n-1,calculate current area and update the 
maximum area.move pointer  according to shorter line if we move taller line area decreases..
*/

int left = 0;
int right = height.length-1;
int maxwater = 0;
while(left<right){
  int h = Math.min(height[left],height[right]);
  int w = right-left;
  maxwater = Math.max(maxwater,w*h);
  if(height[left] < height[right]){
    left++;
  }else{
    right--;
  }
}
return maxwater;
