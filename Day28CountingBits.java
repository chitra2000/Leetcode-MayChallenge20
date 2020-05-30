class Solution 
{
    public int[] countBits(int num) 
    {
        if(num==0)
        {
            int narr[]=new int[1];
            return narr;
        }
        else if(num==1)
        {
            int narr[]=new int[2];
            narr[0]=0;
            narr[1]=1;
            return narr;
        }
        else
        {
        int narr[]=new int[num+1];
        narr[0]=0;
        narr[1]=1;
        for(int i=2;i<narr.length;i++)
        {
            int d=i/2;
            int r=i%2;        
            narr[i]=narr[d]+r;
        }
       
        return narr;
    }
        
        
    }
}
