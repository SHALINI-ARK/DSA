import java.util.*;
    class Main{
        public static boolean check(int arr[],int n,int indx)
        {
            return arr[indx]<arr[0];
        }
        public static void main(String []args)
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
            {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i]= sc.nextInt();
                }
                int l = 0,h=n-1,ans=0;
                while(l<=h)
                {
                    int mid=l+(h-l)/2;
                    if(check(arr,n,mid))
                    {
                        ans=mid;
                        h=mid-1;
                    }
                    else
                    {
                        l=mid+1;
                    }
                }
                System.out.println(ans);
            }
        }
    }

//INPUT
5
5
3 4 5 1 2
5
4 5 1 2 3
5
5 1 2 3 4
5
1 2 3 4 5
5
2 3 4 5 1


//OUTPUT
3
2
1
0
4
