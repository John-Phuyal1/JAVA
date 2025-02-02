import java.util.*;
public class Hello{
    public static void main(String[] args) {
        {
            Scanner sc =new Scanner(System.in);
            int row,col,i,j;
            System.out.println("Enter the number of row");
            row=sc.nextInt();
            System.out.println("Enter the number of col");
            col= sc.nextInt();
            int [][] numbers = new int[row][col];
            for(i=0;i<row;i++)
            {
                System.out.println("Enter the elements of "+(i+1)+"row");
                for(j=0;j<col;j++)
                {
                   numbers[i][j]=sc.nextInt();

                }
            }
            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                    System.out.print(numbers[i][j]+" ");
                }
                System.out.println();
            }
             
        }
    }
}