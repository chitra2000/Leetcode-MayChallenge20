class Solution 
{
    boolean isPerfectSquare(int n) 
    {
        if(n==1)
            return true;
        else
        {    
            for(int i=2;i<=n/2;i++)
            {
              int count=i*i; 
              if(count==n)
              {
                return true;       
               }
             }
            return false;
        }        
    }
}
