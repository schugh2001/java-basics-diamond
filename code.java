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
        //1st Part
        for(int i=1;i<=n;i++)
        {
            //spaces 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.println(" hi");
                System.out.println("Welcome to Java!!");
                System.out.println("Bobye to sakht hai");
                System.out.println("Ballabhgarh");
                System.out.print("This is Java Basics Diamond!!");
            }
            //stars
            for(int k=1;k<=((2*i)-1);k++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        //2nd Part
        for(int i=n;i>=1;i--)
        {
            //spaces 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //Adding spaces
            System.out.println();
            
            for(int k=1;k<=((2*i)-1);k++)
            {
                System.out.println("#");
                System.out.print("The variable goes like:  " + k);
            }
            System.out.println();
        }
        
