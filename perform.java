class perform
{
public static void main()
{
int n=6579,s=0,g;
while(n>0)
{
if(n%2==1)
n/=10;
g=n%10;
System.out.print("\ng=\t"+g);
s=s+g;
n/=5;
}
System.out.print("\ns=\t"+s);
}
}