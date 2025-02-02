
import java.util.*;

public class takeInputInbinarry 
{
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first binary number");
            String first= scanner.nextLine();
            System.out.println("Enter the seconnd binarry number");
            String second= scanner.nextLine();
            int num1 = Integer.parseInt(first,2);
            int num2 = Integer.parseInt(second,2);
            int sum = num1+num2;
            String convertBinary= Integer.toBinaryString(sum); 
            System.out.println("THe sum is "+ convertBinary);
            scanner.close();


        }
    }
}
