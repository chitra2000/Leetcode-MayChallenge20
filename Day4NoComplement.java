class Solution 
{
    public int findComplement(int num)
    {
        String s=Integer.toBinaryString(num);
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='0')
                arr[i]='1';
            else
                arr[i]='0';
        }
        String a=new String(arr);
        int d=Integer.parseInt(a,2); 
        return d;
        
    }
}
