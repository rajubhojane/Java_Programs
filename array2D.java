
class array2D
{
    public static void main(String args[])
    {
       int[][] arr2={
        {1,2,3,4},
        {4,5,6,7},
        {5,6,7,8}
                };
    System.out.println(arr2[1][2]);

    for(int i=0;i<arr2.length;i++)
    {
        for(int j=0;j<arr2[i].length;j++)
        {
           System.out.print(arr2[i][j] + " ");
        }
        System.out.println();
    }
    }
}