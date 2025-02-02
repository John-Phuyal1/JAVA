// Question== Find the index(position) of two sum number.

import java.util.ArrayList;
import java.util.Scanner;

public class givePositionOfNumber 
{ 
    
    public static void main( String[] arg)
    {
        // We canot use difinite array because here is undifine number we  should declear array like this
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number how much you want\n0= for set target");
        
        while (scanner.hasNextInt())
            {
                
                int y= scanner.nextInt();
                if (y==0)
                    break;               
                // THis will add number to the array anad make list and calculate its size.
                nums.add(y);
               
            }
        
        System.out.println("Enter the target");
        int targ= scanner.nextInt();
        int n = nums.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums.get(i) + nums.get(j) == targ) {
                    System.out.println(i+","+ j);
                }
            }
        }
        
    }
        // No solution found


        
}

    

