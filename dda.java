import java .util.*;
class dda
{
public static void main()
{
Scanner in=new Scanner (System.in);
int i,j;
int arr[][]= new int [3][3];
System.out.println("Enter 3*3 matrix ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
arr[i][j]=in.nextInt();
}
}
System.out.println(" All the boundarary element are ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i==0 || i== 2|| j==0||j==2 )
{
System.out.print(" "+arr[i][j]);
}
else
{
System.out.print(" x");
}
}
System.out.println();
}
}
}
