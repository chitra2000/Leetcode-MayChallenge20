class Student
{
    int x,y;
    double d;
    Student(int x,int y,double d)
    {
        this.x=x;
        this.y=y;
        this.d=d;
    }
}
class Distance implements Comparator<Student>
{
    public int compare(Student a,Student b)
    {
        if(a.d>b.d)
         return 1;
        else
         return -1;
    }
}
class Solution 
{
    public int[][] kClosest(int[][] arr, int K)
    {
        ArrayList<Student> narr =new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int x=arr[i][0];
            int y=arr[i][1];
            
            double d=Math.sqrt(Math.pow((double)x,2)+Math.pow((double)y,2));
            narr.add(new Student(x,y,d));
        }
        Collections.sort(narr,new Distance());
        int rarr[][]=new int[K][2];
        for(int i=0;i<rarr.length;i++)
        {
            rarr[i][0]=narr.get(i).x;
            rarr[i][1]=narr.get(i).y;
        }
       return rarr; 
    }
}
