import java .util.*;
class merge1
{
    public static void main()
    {
        Scanner in =new Scanner (System.in);
        int i,j,t;
        int arr1[]=new int[4];
        int arr2[]=new int[4];
        int arr3[]=new int[8];
        System.out.println(" Enter four no. in a first array in ascending order ");
        for(i=0;i<4;i++)
        {
            arr1[i]=in.nextInt();
        }
        System.out.println(" Enter four no. in a Second array in ascending order ");
        for(i=0;i<4;i++)
        {
            arr2[i]=in.nextInt();
        }
        System.out.println(" After merging and sorting ");
        for(i=0;i<4;i++)
        {
            arr3[i]=arr1[i];
            arr3[i+4]=arr2[i];
        }
        for(i=0;i<7;i++)
        {
            for(j=i+1;j<8;j++)
            {
                if(arr3[i]>arr3[j])
                {
                    t=arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=t;
                }
            }
        }
        for(i=0;i<8;i++)
        {
            System.out.println(arr3[i]);
        }
    }
}