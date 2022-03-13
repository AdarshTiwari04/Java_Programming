import java .util.*;
class dda3
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
System.out.println(" Sum of all the column are ");
for(i=0;i<3;i++)
{
sum=0;
for(j=0;j<3;j++)
{
sum=sum+arr[j][i];
}
System.out.println(sum);
}
}
}
