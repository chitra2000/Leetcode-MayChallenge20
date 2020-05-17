class Solution
{
    public boolean checkStraightLine(int[][] c)
    {
         int x[]=new int[c.length];
        int y[]=new int[c.length];
        for(int i=0;i<c.length;i++)
        {
            x[i]=c[i][0];
        }
        for(int i=0;i<c.length;i++)
        {
            y[i]=c[i][1];
        }
        double k=0;
        if(x[1]!=x[0])
        {
            k=(y[1]-y[0])/(x[1]-x[0]);
        }
        else 
            k=0;
        for(int i=1;i<x.length-1;i++)
        {
            float g=0;
            if(x[i]!=x[i+1])
            {
                g=(float)(y[i+1]-y[i])/(x[i+1]-x[i]);
                
            }
            else
                g=0;
            System.out.print("slope= "+g+" ");
            if(g!=k)
                return false;
        }
        return true;
        
    }
}
