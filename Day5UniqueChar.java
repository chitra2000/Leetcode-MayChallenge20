class Solution
{
    public int firstUniqChar(String s) 
    {
        char arr[]=s.toCharArray(); 
        int f=0;
        if(s.length()==1)
            return 0;
        else
        {
            for(int i=0;i<arr.length;i++)
           {
            if(arr[i]>=97&&arr[i]<=123)
            {
                char ch=arr[i];
            int k=i,count=1;
            for(int j=i+1;j<arr.length;j++)
            {   
                if(ch==arr[j])
                {
                    arr[i]=(char)f;
                    arr[j]=(char)f;
                    count++;
                }
            }
                f++;
             if(count==1)
                return k;
           }
           
        }
             return -1;
        }
        
        
    }
}
