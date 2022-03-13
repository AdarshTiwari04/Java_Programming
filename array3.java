import java .util.*;
class array3
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
        System.out.println(" The array sorting is ");
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(arr[i]>arr[j])
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        
        System.out.println(" The remaining no. is ");
        for(i=0;i<4;i++)
        {
            for(j=arr[i]+1;j<arr[i+1];j++)
            {
                
                    System.out.println(j);
                
            }
        }
    }
}
