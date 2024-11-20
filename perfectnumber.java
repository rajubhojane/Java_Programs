import java.util.*;
class perfectnumber
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Any Number : ");
       int n=sc.nextInt();
       
       int sum=0;
       for(int i=1;i<n;i++)
       {
          if(n%i==0)
           {
               sum+=i;
           }
       }
       if(n==sum)
      {
           System.out.println("Number Is perfect ! ");

      }
      else
      {
         System.out.println("Number is not Perfect !");
      }
     
   }
}