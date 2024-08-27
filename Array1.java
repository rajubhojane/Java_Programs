public class Array1 {
    public static void main(String args[])
    {
        int []Numbers;

        Numbers=new int[5];
        String []names=new String[5];
      names[0]="Raju";
      names[1]="g";
      names[2]="h";
      names[3]="j";
      names[4]="l";
      //names[5]="5";
      int length=names.length;
      System.out.println(length);

        for(String name:names)
        {
            System.out.println(name);
        }
        

     //names={"raju","monika","Radhika","sonal","monal"};
        System.out.println(names[4]);

    }
    
}
