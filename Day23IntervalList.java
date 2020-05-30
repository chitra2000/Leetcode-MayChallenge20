class Solution 
{
    public int[][] intervalIntersection(int[][] A, int[][] B)
    { 
        
            int arr[][]=new int[1000][2];
            int i=0,j=0,k=0;
           while(i<A.length&&j<B.length)
           {
              
                int l=Math.max(A[i][0],B[j][0]);
                int h=Math.min(A[i][1],B[j][1]);
                System.out.println(l+" "+h+" "+k);
                if(l<=h)
                {   
                   arr[k][0]=l;
                   arr[k][1]=h;
                   k=k+1;
                }
             
                if(A[i][1]<B[j][1])
                 i++;
                else
                  j++;
           }
         
          int narr[][]=new int[k][2];
          for(int f=0;f<k;f++)
          {
            narr[f][0]=arr[f][0];
            narr[f][1]=arr[f][1];
          }
             return narr;
        
       
       
    }
}
