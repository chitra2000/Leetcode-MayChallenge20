class Solution 
{
    public int maxSubarraySumCircular(int[] A)
    {
        int count=0,min=Integer.MIN_VALUE,k1=0,k2=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<0)
            {
                count++;
                if(min<A[i])
                    min=A[i];
            }
        }
        System.out.println("Minimum= "+count);
        if(count<A.length)
        {
            int max=Integer.MIN_VALUE,mtn=0;
            for(int i=0;i<A.length;i++)
            {
                mtn=mtn+A[i];
                if(mtn<0)
                    mtn=0;
                else if(mtn>max)
                    max=mtn;
            }
            k1=max;
        }
        else if(count==A.length)
        {
            int max=min,mtn=0;
            for(int i=0;i<A.length;i++)
            {
                mtn=mtn+A[i];
                if(mtn<0)
                    mtn=0;
                else if(mtn>max)
                    max=mtn;
            }
            k2=max;       
        }
        int ls[]=new int[A.length];
        int rs[]=new int[A.length];
        int lsm[]=new int[A.length];
        int rsm[]=new int[A.length];
        int sum1=0,sum2=0;
        for(int i=0;i<A.length;i++)
        {
            sum1=sum1+A[i];
            ls[i]=sum1;
        }
        for(int i=A.length-1;i>=0;i--)
        {
            sum2=sum2+A[i];
            rs[i]=sum2;
        }
        lsm[0]=ls[0];
        rsm[rsm.length-1]=rs[rs.length-1];
        for(int i=1;i<lsm.length;i++)
        {
            lsm[i]=Math.max(lsm[i-1],ls[i]);
        }
        for(int i=rsm.length-2;i>=0;i--)
        {
            rsm[i]=Math.max(rsm[i+1],rs[i]);
        }
        int n=0,value=0;
        if(count<A.length)
        {   
            n=Integer.MIN_VALUE;
            for(int i=0;i<lsm.length-1;i++)
            {
               int v=lsm[i]+rsm[i+1];
               if(n<v)
                   n=v;
            }
             value=Math.max(n,k1);     
        }
        else if(count==A.length)
        {   
            n=min;
            for(int i=0;i<lsm.length-1;i++)
            {
               int v=lsm[i]+rsm[i+1];
               if(n>v)
                   n=v;
            }
            
             value=Math.max(n,k2);     
        }
        return value;
    }
}
