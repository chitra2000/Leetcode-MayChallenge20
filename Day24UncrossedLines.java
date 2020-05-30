class Solution 
{ 
    int l[][];
    public int max(int arr1[],int arr2[],int i,int j)
    {
        if(i>=arr1.length||j>=arr2.length)
            return 0;
        else
        {
            if(arr1[i]==arr2[j])
            {
                if(l[i+1][j+1]==-1)
                {
                    l[i+1][j+1]=max(arr1,arr2,i+1,j+1);
                }
                return 1+l[i+1][j+1];
                
            }
            
            else
            {
                if(l[i+1][j]==-1)
                 l[i+1][j]=max(arr1,arr2,i+1,j);
                if(l[i][j+1]==-1)
                 l[i][j+1]=max(arr1,arr2,i,j+1);
                return Math.max(l[i+1][j],l[i][j+1]);
            } 
              
        }
       
    }
    public int maxUncrossedLines(int[] A, int[] B)
    {
        l=new int[A.length+1][B.length+1];
        for(int i=0;i<l.length;i++)
        {
            for(int j=0;j<l[i].length;j++)
            {
                l[i][j]=-1;
            }
        }
        int val=max(A,B,0,0);
        return val;
    }
}
