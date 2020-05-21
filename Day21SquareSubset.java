class Solution 
{
    public int countSquares(int[][] arr)
    {
        int m=arr.length;
        int n=arr[0].length;
        int narr[][]=new int[m][n];
        int sum=0;
        for(int i=0;i<m;i++)
        { 
           narr[i][0]=arr[i][0];
           sum=sum+narr[i][0];
        }
       
        for(int i=0;i<n;i++)
        { 
           narr[0][i]=arr[0][i];
            sum=sum+narr[0][i];
        }     
         
        for(int i=1;i<m;i++)
        {
            int s=0;
            for(int j=1;j<n;j++)
            {
                if(arr[i][j]==1)
                {
                    s=1;
                    int min1=(int)Math.min(narr[i-1][j-1],narr[i][j-1]);
                    int min2=(int)Math.min(min1,narr[i-1][j]);
                    narr[i][j]=s+min2;
                    sum=sum+narr[i][j];
                }
            }  
            
        }
         sum=sum-narr[0][0];
        return sum;
        
        
    }
}
