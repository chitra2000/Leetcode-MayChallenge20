class Solution 
{
    public boolean func(int N,LinkedList ll[],int source)
    {
         int colour[]=new int[N];
        Queue<Integer> q1=new LinkedList<>();
        int black=1;
        int white=2;
        q1.add(source);
        colour[source]=black;
        while(!q1.isEmpty())
        {
            int b=q1.poll();
            Iterator<Integer> itr=ll[b].iterator();
            while(itr.hasNext())
            {
                int k=itr.next();
                
                if(colour[k]==0)
                {
                   
                    if(colour[b]==black)
                        colour[k]=white;
                    else
                        colour[k]=black;
                    q1.add(k);
                }
                else
                {
                    if(colour[k]==colour[b])
                        return false;
                }
            }
        }
        return true;
    }
    public boolean possibleBipartition(int N, int[][] arr) 
    {
        LinkedList ll[]=new LinkedList[N];
        for(int i=0;i<N;i++)
        {
            ll[i]=new LinkedList<Integer>();
        }
       
        for(int i=0;i<arr.length;i++)
        {
            int a=arr[i][0]-1;
            int b=arr[i][1]-1;
            
            ll[a].add(b);
        }
        for(int i=0;i<N;i++)
        {
            boolean res=func(N,ll,i);
            if(res==false)
            {
                return false;
                
            }
        }
        return true;
    }
}
