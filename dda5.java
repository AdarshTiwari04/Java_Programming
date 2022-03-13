import java .util.*;
class dda5
{
    public static void main()
    {
        Scanner in=new Scanner (System.in);
        int i,j,max=0,sw;
        int arr[][]= new int [3][3];
        System.out.println("Enter 3*3 matrix ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }

        for(i=0;i<3;i++)
        {
                    max=arr[i][0];
            for(j=0;j<3;j++)
            {
                if(max<arr[i][j])
                {
                    max=arr[i][j];
                }
            }
            System.out.println(" The largest no's present in the row are ");
            System.out.println(max);
        }
    }
}