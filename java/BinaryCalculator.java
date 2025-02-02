
import java.util.*;

public class BinaryCalculator
{
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter which type of conversion you want binary, octal,decimal,hexadecimal");
        String conver=scanner.nextLine();
        switch(conver)
        {
            case "binary":
                
                System.out.println("Enter your first binary number");
                String firstBinary= scanner.nextLine();
                System.out.println("Enter the operator");
                String operator=scanner.nextLine();
                System.out.println("Enter the senond binary number");
                String secondBinary= scanner.nextLine();
                int num1= Integer.parseInt(firstBinary,2);
                int num2= Integer.parseInt(secondBinary,2);
                switch(operator)
                {
                    case "+":
                        System.out.println("the sum is "+Integer.toBinaryString(num1+num2));
                        break;
                    case "-":
                        System.out.println("The subtraction is "+Integer.toBinaryString(num1-num2));
                        break;
                    case "/":   
                        if (num1<num2|| num2==0)
                        {
                            System.out.println("The answer is zero it doesnot count decimal value");
                        }
                        if(num1> num2)
                        {
                            System.out.println("The division is "+ Integer.toBinaryString(num1/num2));

                        }
                        break;
                    case "*":
                        System.out.println("The multlypication is " + Integer.toBinaryString(num1*num2));
                        break;
                    default:
                        System.out.println("Plase choose wright operator");
                        break;                 

                    
                  }
                break;
            
            case "octal":
                  
                System.out.println("Enter your first octal number");
                String firstOctal= scanner.nextLine();
                System.out.println("Enter the operator");
                String operator1=scanner.nextLine();
                System.out.println("Enter the senond octal number");
                String secondOctal= scanner.nextLine();
                int octal1= Integer.parseInt(firstOctal,8);
                int octal2= Integer.parseInt(secondOctal,8);
                switch(operator1)
                {
                    case "+":
                        System.out.println("the sum is "+Integer.toOctalString(octal1+octal2));
                        break;
                    case "-":
                        System.out.println("The subtraction is "+Integer.toOctalString(octal1-octal2));
                        break;
                    case "/":   
                        if (octal1<octal2|| octal2==0)
                        {
                            System.out.println("The answer is zero it doesnot count decimal value");
                        }
                        if(octal1> octal2)
                        {
                            System.out.println("The division is "+ Integer.toOctalString(octal1/octal2));

                        }
                        break;
                    case "*":
                        System.out.println("The multlypication is " + Integer.toOctalString(octal1*octal2));
                        break;
                    default:
                        System.out.println("Plase choose wright operator");
                        break;                 

                    
                  }
                  break;
                  case "hexadecimal":
                    
                System.out.println("Enter your first hexadecimal number");
                String firstHexa= scanner.nextLine();
                System.out.println("Enter the operator");
                String operator3=scanner.nextLine();
                System.out.println("Enter the senond  hexadecimal number");
                String secondHexa= scanner.nextLine();
                int hexa1= Integer.parseInt(firstHexa,16);
                int hexa2= Integer.parseInt(secondHexa,16);
                switch(operator3)
                {
                    case "+":
                        System.out.println("the sum is "+Integer.toHexString(hexa1+hexa2));
                        break;
                    case "-":
                        System.out.println("The subtraction is "+Integer.toHexString(hexa1-hexa2));
                        break;
                    case "/":   
                        if (hexa1<hexa2|| hexa2==0)
                        {
                            System.out.println("The answer is zero it doesnot count decimal value");
                        }
                        if(hexa1> hexa2)
                        {
                            System.out.println("The division is "+ Integer.toHexString(hexa1/hexa2));

                        }
                        break;
                    case "*":
                        System.out.println("The multlypication is " + Integer.toHexString(hexa1*hexa2));
                        break;
                    default:
                        System.out.println("Plase choose wright operator");
                        break;                 

                    
                  }
                break;
                case "decimal":
                    
                        System.out.println("Enter your first binary number");
                        int first= scanner.nextInt();
                        System.out.println("Enter the operator");
                        String operator4=scanner.nextLine();
                        System.out.println("Enter the senond binary number");
                        int second= scanner.nextInt();
                                              
                        switch(operator4)
                        {
                            case "+":
                                System.out.println("the sum is "+(first+second));
                                break;
                            case "-":
                                System.out.println("The subtraction is "+(first-second));
                                break;
                            case "/":   
                                if (first<second|| second==0)
                                {
                                    System.out.println("The answer is zero it doesnot count decimal value");
                                }
                                if(first> second)
                                {
                                    System.out.println("The division is "+ Integer.toHexString(first/second));

                                }
                                break;
                            case "*":
                                System.out.println("The multlypication is " + Integer.toHexString(first*second));
                                break;
                            default:
                                System.out.println("Plase choose wright operator");
                                break;                 

                            
                        }
                        break;

                   
            
                  
            
                

        }

        
        scanner.close();

    }

}
