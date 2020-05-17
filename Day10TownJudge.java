class Solution 
{
    public int findJudge(int N, int[][] trust) 
    {
        int arr[]=new int[N];
        if(trust.length==2)
        {
            if(trust[0][1]==trust[1][1])
             return trust[1][1];
            else
                return -1;
        }
        else if(trust.length==1)
            return trust[0][1];
        else if(N==1)
            return 1;
        else
        {  
            
        for(int i=0;i<trust.length;i++)
        {
            int k=trust[i][1]-1;
            arr[k]++;
        }   
        int max=arr[0];
        int p=1;
        for(int i=1;i<N;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                p=i+1;
            }
        }
            
            for(int i=0;i<trust.length;i++)
            {
                if(p==trust[i][0])
                {
                    p=-1;
                    break;
                }
            }            
        if(max<N-1)
            p=-1;
        return p;
        }
        
    }
}
