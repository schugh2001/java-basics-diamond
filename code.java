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
        
        //Part unknown
        {
            //Command line arguments
            
            int count, x = ;
            String str;
            count = args.length;
            
            System.out.println("Number of Arguments passed:  " + coutn);
            
            while (x < count)
            {
                str = args[x];
                x++;
                System,out.println("Features of Java " + str);
            }
        
    }
}
