class Solution 
{
    public int majorityElement(int[] nums)
    {
       Arrays.sort(nums);
       int max=0,val=0;
        if(nums.length==1)
            return nums[0];
        else
        {
            for(int i=0;i<nums.length;i++)
       {
           int v=nums[i];
           int c=0;
           while(i<nums.length-1&&v==nums[i+1])
           {
               c++;
               i++;     
           }
           if(c>max)
           {
              max=c;
              val=nums[i];
           } 
       }
        return val;
        }
        
    }
}
