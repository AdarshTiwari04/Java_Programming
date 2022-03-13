import java .util.*;
class dda4
{
public static void main()
{
Scanner in=new Scanner (System.in);
int i,j,sum=0;
int arr[][]= new int [3][3];
System.out.println("Enter 3*3 matrix ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
arr[i][j]=in.nextInt();
}
}
System.out.println(" the  Original matrix ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(" "+arr[i][j]);
}
System.out.println();
}
System.out.println(" After rotating 90 degree ");
for(j=0;j<3;j++)
{
for(i=2;i>=0;i--)
{
System.out.print(" "+arr[i][j]);
}
System.out.println();
}
}
}
