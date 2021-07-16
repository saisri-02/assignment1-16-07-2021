import java.util.*;
public class Remadd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Vector v=new Vector();
System.out.print("Enter n value : ");
int n=sc.nextInt();
System.out.print("Enter "+n+" values : ");
for(int i=0;i<n;i++)
{
v.add(sc.nextInt());
}
System.out.println("Elements are : "+v);
System.out.print("Enter value to be removed and value to be added : ");
int a=sc.nextInt();
int b=sc.nextInt();
if(v.contains(a))
{
int c=v.indexOf(a);
v.set(c,b);
System.out.println(v);
}
else 
{
System.out.println("false");
}
}
}

output:

Enter n value : 5
Enter 5 values : 10 20 30 40 50
Elements are : [10, 20, 30, 40, 50]
Enter value to be removed and value to be added : 20 99
[10, 99, 30, 40, 50]

Enter n value : 5
Enter 5 values : 10 20 30 40 50
Elements are : [10, 20, 30, 40, 50]
Enter value to be removed and value to be added : 2 99
false