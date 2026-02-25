/*Here for this problem majority element is defines as the element which occurs more than [n/2]
times
Let element be candidate maintain candidate and count.iterate through array  if count=0 set
current number as candidate.if current number matches candidate increment coununt if not decrement it
upto 0.final
candidate is majority element*/

int candidate = 0;
int count = 0;
for(int num:nums){
  if(count==0){
    candidate =num;
  }
  count+=(num==candidate) ? 1:-1;
}
return candidate;
