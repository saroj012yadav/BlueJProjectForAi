import java.util.Scanner;

/**
 * Write a description of class UserInputExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputExample
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first NUmber123");
        int firstNumber=sc.nextInt();
        System.out.println("Enter the second Number");
        int secondNumber=sc.nextInt();
        
        int sum=firstNumber+secondNumber;
        System.out.println("The sum of two value is"+sum);
        
            int bigger=(firstNumber>secondNumber)?firstNumber:secondNumber;
            System.out.println("bigger number is"+bigger);
            sc.close();
        
        
        
    }
}