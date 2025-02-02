
import java.util.*;

class SumNumber_binaryNUmber 
{
    public static void main ( String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the two number");
        int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        int sum= n1+ n2;
        binaryNumber(sum);

        scanner.close();

    }
    private static void binaryNumber( int n)
    {
        String y = Integer.toBinaryString((int)n);
        System.out.println("The binary number of sum is "+ y);
    }

}

