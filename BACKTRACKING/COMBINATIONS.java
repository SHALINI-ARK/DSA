import java.util.*;
public class Main {
    public static void solve(int nums[],List<List<Integer>>res,int index,ArrayList<Integer>curr,int k)
    {
        if(curr.size()==k)
        {
            res.add(new ArrayList<>(curr));
        }
        for(int i=index;i<nums.length;i++)
        {
            curr.add(nums[i]);
            solve(nums,res,i+1,curr,k);
            curr.remove(curr.size()-1);
        }
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] =  i+1;
        }
        solve(nums,res,0,new ArrayList<>(),k);
        return res;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element:");
        int n = sc.nextInt();
        System.out.print("Enter the Range for combination:");
        int k = sc.nextInt();
        System.out.print("combinations:"+combine(n,k));
    }
}



//INPUT
Enter the number of element:4
Enter the Range for combination:2


//OUTPUT
combinations:[[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
