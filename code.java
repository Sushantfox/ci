import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Value of p: ");
      float p = s.nextFloat();
      System.out.print("Enter the Value of r: ");
      float r = s.nextFloat();
      System.out.print("Enter the Value of t: ");
      float t = s.nextFloat();
      System.out.print("Enter the Value of n: ");
      float n = s.nextFloat();
      
      float amount = p * (float)Math.pow(1 + (r/n), (n*t));
      float ci = amount - p;
      
      System.out.println("\nAmount = " +amount);
      System.out.println("Compound Interest = " +ci);
   }
}
