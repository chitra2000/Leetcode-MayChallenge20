class Solution
{
    public boolean checkInclusion(String p, String s) 
    {
        int arr[]=new int[26];
        for(int i=0;i<p.length();i++)
        {
            int ch=p.charAt(i);
            arr[ch-97]++;
        }
       
        int y=p.length();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            int narr[]=new int[26];
            if(i+y<=s.length())
            {
                String temp=s.substring(i,i+y);
                for(int j=0;j<temp.length();j++)
                {
                    int ch=temp.charAt(j);
                    narr[ch-97]++;
                }
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[j]==narr[j])
                       count++;
                    else
                        break;
                }
                if(count==26)
                    return true;
            }
        }
        return false;
        
        
    }
}
