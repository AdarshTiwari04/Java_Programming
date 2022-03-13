import java.util.*;
class array2
{
    public static void main()
    {
        Scanner in=new Scanner (System.in);
        int i,j,m;
        int arr[]=new int[10];
        System.out.println(" Enter 10 number ");
        for(i=0;i<10;i++)
        {
            arr[i]=in.nextInt();
        }
        m=arr[9];
        arr[9]=0;
        System.out.println(" After rearraning the array ");
        for(i=9;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=m;
        for(i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
