import java.util.*;
class Main {
    static public int subarray(int [] nums,int k)
    {
        int i=0,j=0,c=0,u=0;
        int freq[] = new int [2000000];
        for(i=0;i<nums.length;i++)
        {
            if(freq[nums[i]]==0)
            {
                u++;
               
            }
            freq[nums[i]]++;
            while(u==k)
            {
                c+=nums.length-i;
                if(freq[nums[j]]==1)
                {
                    u--;
                }
                freq[nums[j]]--;
                j++;
            }
        }
        return c;
    }
    static public int subarraysWithKDistinct(int[] nums, int k)
    {
        return subarray(nums,k)-subarray(nums,k+1);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the count of Distinct element:");
        int k = sc.nextInt();
        System.out.println("The Subarray with k Distinct Elements:"+subarraysWithKDistinct(nums,k));
    }
}


//INPUT:
Enter Number of Elements:5
Enter the elements: 1 2 1 2 3
Enter the count of Distinct element:2

//OUTPUT
The Subarray with k Distinct Elements:7
