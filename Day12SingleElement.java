class Solution 
{
    public int singleNonDuplicate(int[] arr)
    {
        int k=0,i=1;
        if (arr.length==1)
            k=arr[0];
        else
        {
            for( i=1;i<arr.length;i=i+2)
           {
            if(arr[i]!=arr[i-1])
            {
                k=arr[i-1];
                break;
            }
           }
            if(i==arr.length&&k==0)
            {
               k=arr[arr.length-1];
            } 
        }
        return k;
    }
}
