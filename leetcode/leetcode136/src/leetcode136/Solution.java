package leetcode136;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Solution {
    public static int singleNumber(int[] nums) {
        int singleNumber=0;
        for(int i=0;i<nums.length;i++){
            singleNumber=singleNumber^nums[i];
        }
        return singleNumber;
    }
    
    public static void main(String[] args) throws Exception{
    	try{
	    	BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
	    	String inputNumbers=stdin.readLine();
	    	String[] numbers=inputNumbers.split(" ");
	    	int[] nums=new int[numbers.length];
	    	for(int i=0;i<numbers.length;i++){
	    		nums[i]=Integer.parseInt(numbers[i]);
	    	}
	    	int ans=0;
	    	ans=singleNumber(nums);
	    	System.out.println(ans);
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
