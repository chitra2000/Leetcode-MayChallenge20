class Solution 
{
    void flood(int[][] image,int sr,int sc,int n,int k)
    {
        if(sr>=0&&sc>=0&&sr<image.length&&sc<image[0].length&&image[sr][sc]!=n&&image[sr][sc]==k)
        {
            image[sr][sc]=n;
            flood(image,sr,sc-1,n,k);
            flood(image,sr,sc+1,n,k);
            flood(image,sr-1,sc,n,k);
            flood(image,sr+1,sc,n,k);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        int k=image[sr][sc];
        flood(image,sr,sc,newColor,k);
        return image;
    }
}
