class Solution 
{
    public int numJewelsInStones(String J, String S)
    {
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            String k=ch+"";
            System.out.println(ch);
            if(J.contains(k))
            {
                count++;
                int x=S.indexOf(ch);
                S=S.substring(0,x)+S.substring(x+1);
                i=i-x-1;
            }
            System.out.println(S);
        }
        return count;
    }
}
