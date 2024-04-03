import java.util.*;
public class Main {
    public static int[][] merge(int[][] in){
        Arrays.sort(in,(a,b)->{ return a[0]-b[0];});
        ArrayList<int []> ans = new ArrayList<>();
        for(int i[] : in)
        {
            if(ans.size()==0)
              ans.add(i);
            else
            {
                int [] last = ans.get(ans.size()-1);
                if(i[0]>last[1])
                {
                    ans.add(i);
                }
                else
                {
                    last[1]=Math.max(i[1],last[1]);
                }
            }
        }  
        return ans.toArray(new int[ans.size()][2]);
    }
   
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of intervals:");
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        System.out.print("Enter the intervals:");
        for(int i=0;i<n;i++)
        {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int res[][] = merge(arr);
        System.out.println("Intervals after merged:");
        for(int [] i:res)
        {
            System.out.print("["+i[0]+","+i[1]+"] ");
        }
    }
}

//INPUT
Enter the number of intervals:4
Enter the intervals:
1 3
2 6
8 10
15 18

//OUTPUT
Intervals after merged:
[[1,6],[8,10],[15,18]]
