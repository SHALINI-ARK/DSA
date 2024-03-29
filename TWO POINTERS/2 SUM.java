import java.util.ArrayList;

import java.util.*;

import java.util.Arrays;

 

public class Solution {

    public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {

        // Write your code here.

        Collections.sort(arr);

        boolean pairFound = false;

        ArrayList<Pair<Integer,Integer>> sum=new ArrayList<>();

        //ArrayList<Pair<Integer, Integer>> ans = new ArrayList<>();

    

        int i=0;

        int j=arr.size()-1;

        while(i<j){

            int sum1=arr.get(i)+arr.get(j);

            if(sum1==target){

                sum.add(new Pair(arr.get(i),arr.get(j)));

                 pairFound = true;

                 i++;

                 j--;

            }

            else if(sum1>target)

            j--;

            else i++;

        }

        if(!pairFound){

            sum.add(new Pair(-1,-1));

        }
        return sum;

    }

}
