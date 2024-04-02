import java.util.*;
public class Main {
    public static int trap(int[] height) {
       int i=0,j=height.length-1,ml=0,mr=0,water=0;
       while(i<j)
       {
           if(height[i]<=height[j])
           {
               ml=Math.max(ml,height[i]);
               water+=ml-height[i];
               i++;
           }
           else
           {
               mr=Math.max(mr,height[j]);
               water+=mr-height[j];
               j--;
           }
       }
       return water;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Water trapped:"+trap(arr));
    }
}

//INPUT
Enter the number of elements:6
Enter the elements:4 2 0 3 2 5

//OUTPUT
Water trapped:9
