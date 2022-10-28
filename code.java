import java.util.*;
public class diamond
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        diamond(n);
    }
    public static void diamond(int n)
    {
        //1st half
        for(int i=1;i<=n;i++)
        {
            //spaces 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.println(" hi");
                System.out.print("Welcome to Java!!");
            }
            //stars
            for(int k=1;k<=((2*i)-1);k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--)
        {
            //spaces 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=((2*i)-1);k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        
        //Comparison
        {
            //Lets compare 3 numbers
            int n1, n2, n3, max;
            
            Scanne sc = new Scanner (System.in);
            
            System.out.print("Enter the First Number:  ");
            num1 = sc.nextInt();
            System.out.print("Enter the Second Number:  ");
            num2 = sc.nextInt();
            System.out.print("Enter the Third Number:  ");
            num3 = sc.nextInt();
        
            System.out.println();

            max = num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);

            System.out.println("The Largest Number out of " + num1 + ", " + num2 + " and " + num3 + " is:  " + max);
        }
        
    }
}
