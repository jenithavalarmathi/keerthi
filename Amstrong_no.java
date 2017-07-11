import java.util.*;
import java.io.*;
public class Amstrong_no{
  public static void main(String args[]){
    int n,rem,i,j=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number is");
    n=s.nextInt();
    i=n;
    while(i!=0)
    {
      rem=i%10;
      j=j+rem*rem*rem;
      i=i/10;
    }
    if(j==n)
    {
      System.out.println(n+"  is Amstrong number");
    }
    else
    {
      System.out.println(n+"is not Amstrong Number");
    }
  }
}
      
      
      
      
  
