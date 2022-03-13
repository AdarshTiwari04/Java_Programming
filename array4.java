import java .util.*;
class array4
{
    public static void main()
    {
        Scanner in =new Scanner(System.in);
        int i,j,t;
        int arr[]= new int[5];
        System.out.println (" Enter 5 no. ");
        for(i=0;i<5;i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=1;i<5;i++)
        {
            t=arr[i];
            j=i-1;
            while (j>=0&& arr[j]>t)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=t;
        }
        for(i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}