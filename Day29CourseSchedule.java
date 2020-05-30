class Solution 
{
    public boolean Cycle(int i,LinkedList ll[],boolean visited[],boolean re[])
    {
        if(re[i])
            return true;
        if(visited[i])
            return false;
        visited[i]=true;
        re[i]=true;
        Iterator<Integer> itr=ll[i].iterator();
        while(itr.hasNext())
        {
            int b=itr.next();
            if(Cycle(b,ll,visited,re))
                return true;
        }
        re[i]=false;
        return false;
    }
    public boolean isCyclic(LinkedList ll[],int n)
    {
        boolean visited[]=new boolean[n];
        boolean re[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(Cycle(i,ll,visited,re))
            {
                return true;
            }
            
        }
        return false;
    }
    public boolean canFinish(int n, int[][] pre) 
    {
        LinkedList ll[]=new LinkedList[n];
        for(int i=0;i<n;i++)
        {
            ll[i]=new LinkedList<Integer>();
        }
        for(int i=0;i<pre.length;i++)
        {
            int a=pre[i][0];
            int b=pre[i][1];
            ll[a].add(b);
        }
        if(isCyclic(ll,n))
            return false;
        else
            return true;
        
    }
}
