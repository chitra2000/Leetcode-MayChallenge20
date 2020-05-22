class Solution 
{
    public String frequencySort(String s)
    {
        int arr[]=new int[128];
        for(int i=0;i<s.length();i++)
        {
            int a=(int)s.charAt(i);
            arr[a]++;
        }
        String a="";
        for(int i=0;i<arr.length;i++)
        {
            int max =arr[i];
            int val=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(max<arr[j])
                {
                    max=arr[j];
                    val=j;
                }
            }
            for(int k=0;k<max;k++)
            {
                char ch=(char)val;
                a=a+ch;
            }
            arr[val]=0;
        }
        return a;
    }
}
