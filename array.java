import java.util.*;
class array
{
public static void main()
{
Scanner in=new Scanner (System.in);
int i,j,n,k;
int arr[]=new int[100];
System.out.println(" Enter the number of terms ");
n=in.nextInt();
System.out.println(" Enter "+n+" number in an array ");
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
System.out.println(" The result after removing duplicating  are");
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
arr[i]=0;
}
}
}
for(i=0;i<n;i++)
{
if(arr[i]==0)
{
for(k=i+1;k<n;k++)
{
arr[k-1]=arr[k];
}
n--;
}
}    
for(i=0;i<n;i++)
{
System.out.println(arr[i]);                                                                                                                                                                                                                                        
}
}
}