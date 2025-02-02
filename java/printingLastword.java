
import java.util.*;

public class printingLastword {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence ");
        String sen= scanner.nextLine();
        String[] words = sen.split(" ");
        int n=words.length;
        if(n>0) 
        {
            System.out.println("last word is "+words[n-1]);
        }
        else 
        {
            System.out.println("No last word");
        }
        scanner.close();


    }
    
}
