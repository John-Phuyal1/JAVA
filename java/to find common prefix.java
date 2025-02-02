
import java.util.*;
import java.util.function.*;

class test2
{
    
    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in);
         // taking number( how many words  do you have)
         System.out.println("Ehter the number of words");
         int n = scanner.nextInt();
         scanner.nextLine();
         // making array
         String[] words = new String[n];
         System.out.println("Enter the words");
         // taking words
         for(int i=0; i<n; i++)
         {
            words[i]= scanner.nextLine();
         }
         // making another variable which take input from method/function check.
         String commonCheck = check(words);
         // checking
         if( commonCheck.isEmpty())
         {
            System.out.println("NO prefix is match");
         }

         else 
         {
            System.out.println(" Prefix is found =="+ commonCheck);
         }
         scanner.close();
                

   
    } 
    private static String check(String[] words) 
    {   // checking input
        if(words==null || words.length==0)
         return "";
         // comparing words
        String prefix = words[0];
        for( int i=1; i< words.length;i++)
        {
            if(prefix.isEmpty())
                return"";
            while(words[i].indexof(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }


    }
}
    

