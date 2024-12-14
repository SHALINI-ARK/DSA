import java.util.*;
public class Main
{
    public static int check(int arr[],int n,int key)
    { int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[low]<=arr[mid])
            {
                if(key>=arr[low] && arr[mid]>key)
                {
                    high = mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                if(key<=arr[high] && key>arr[mid])
                {
                    low=mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int target = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    System.out.println(check(arr,n,target));
		}
	}
}

//INPUT
2
9 3
5 6 7 8 9 10 1 2 3
4 6
3 5 1 2

  
//OUTPUT
 8
-1
