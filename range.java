import java.util.*;
class range
{
public static void main()
{
Scanner in=new Scanner (System.in);
int m,n,i,j,c=0;
System.out.println(" Enter the value m & n ");
m=in.nextInt();
n=in.nextInt();
for(i=m;i<=n;i++)
{
c=0;
for(j=1;j<=n;j++)
{
if(i%j==0)
{
c++;
}
}
if(c==2)
{
System.out.println(i);
}
}
}
}
