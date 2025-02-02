public class test{
    public static void main( String[] args)
    {
     
        int i,j;
        for ( i=0;i<5;i++)
        {
            for(j=0;j==i && j<5;j++)
            {
                if(i==0 || j==0 || j==4 || i==4)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print("");
                }

            }
            System.out.println();
        }
    }

}