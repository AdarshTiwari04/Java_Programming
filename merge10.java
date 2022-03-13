import java .util.*;
class merge10
{
    public static void main()
    {
        Scanner in =new Scanner (System.in);
        int i,j,k=0,t;
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
        for(i=0,j=0,k=0;i<4&&j<4;k++)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k]=arr1[i];
                i++;
            }
            else
            {
                arr3[k]=arr2[j];
                j++;
            }
        }
        for(t=i;t<4;t++)
        {
                arr3[k]=arr1[t];
                k++;
                
        }
        for(t=j;t<4;t++)
        {
                arr3[k]=arr1[t];
                k++;
        }    
        
        for(i=0;i<8;i++)
        {
            System.out.println(arr3[i]);
        }
    }
}