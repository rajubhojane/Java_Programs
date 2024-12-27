class Fibonacci_without_recursion{
    public static void main(String args[])
    {
        int n0=0,n1=1,n2,count=30;
        System.out.print(n0+" "+n1);
        for(int i=2;i<count;i++)
        {
            n2=n0+n1;
            System.out.print(" "+n2);
            n0=n1;
            n1=n2;

        }
    }
}