class Solution 
{
    public int findMaxLength(int[] ar) 
    {
        int n=ar.length;
        int max=0;
        int s=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int x=0;x<n;x++)
        {
            //System.out.println("A"+ar[x]);
            s=s+(ar[x]==0?-1:1);
            //System.out.println(s);
            if(s==0)
            {
                if(x+1>max)
                {
                    max=x+1;
                }
            }
            if(map.containsKey(s))
            {
               int y=map.get(s);
                if(x-y>max)
                {
                    max=x-y;
                }
            }
            else
            {
                map.put(s,x);
            }
        }
        if(s==0)
        {
            max=n;
        }
        return max;
    }
}
