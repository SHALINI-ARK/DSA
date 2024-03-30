import java.util.*;
public class Main
{
public static List< List < Integer > > triplet(int n, int []arr) {
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0;i<n;i++){

            if(i>0 && arr[i]==arr[i-1]) continue;

            int j=i+1;

            int k=n-1;

            while(j<k){

                int sum=arr[i]+arr[j]+arr[k];

                if(sum<0){

                    j++;

                }else if(sum>0){

                    k--;

                }else{

                    List<Integer> res=Arrays.asList(arr[i],arr[j],arr[k]);

                    ans.add(res);

                    j++;

                    k--;

                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }
            }
        }

        return ans;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        List< List < Integer > > res = triplet(n,arr);
        for(List<Integer> i : res)
        {
            System.out.println(i);
        }
    }
}
