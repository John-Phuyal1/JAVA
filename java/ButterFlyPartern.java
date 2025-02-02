public class ButterFlyPartern{
    public static void main( String[] args)
    {
        int n=4,i,j;
        for(i=1;i<=n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j<i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(j=n;j>0;j--)
            {
                if(j<=i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=n;i>0;i--)
        {
            for(j=0;j<n;j++)
            {
                if(j<i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(j=n;j>0;j--)
            {
                if(j<=i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        


    }


}