import java.io.*;
import java.util.*;
public class even
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int ip=s.nextInt();
if(ip%2==0)
{
System.out.println("the no is even");
}
else if(ip%2!=0)
{
System.out.println("the no is odd");
}
else
{
System.out.println("invalid input");
}
}
}
