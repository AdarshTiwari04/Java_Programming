import java .util.*;
class merge2
{
    public static void main()
    {
        Scanner in =new Scanner (System.in);
        int i,j,k=0;
        int arr1[]=new int[4];
        int arr2[]=new int[4];
        int arr3[]=new int[8];
        System.out.println(" Enter four no. in a first array in ascending order ");
        for(j=0;j<4;j++)
        {
            arr1[j]=in.nextInt();
        }
        System.out.println(" Enter four no. in a Second array in ascending order ");
        for(j=0;j<4;j++)
        {
            arr2[j]=in.nextInt();
        }
        System.out.println(" After merging in sorted order is ");
        for(i=0;i<8;i=i+2)
        {
            for(j=k;j<4;j++)
            {      
                if(arr1[j]>arr2[j])
                {
                    arr3[i]=arr2[j];
                    arr3[i+1]=arr1[j];
                    
                }
                else
                {
                    arr3[i]=arr1[j];
                    arr3[i+1]=arr2[j];
                    
                }
                break;
            }
            k++;
        }
        for(i=0;i<8;i++)
        {
            System.out.println(arr3[i]);
        }
    }
}