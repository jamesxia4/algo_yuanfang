package leetcode283;

public class Solution {
    public static void moveZeroes(int[] nums) {
    	
        int zeroCount=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==0){
        		++zeroCount;
        	}
        }
        
        for(int k=0;k<nums.length;k++){
        	//Optimization, num.length--->num.length-k
	        for(int i=0;i<nums.length-k;i++){
	            if(nums[i]==0){
	            	//Optimization,num.length-1--->num.length-1-k
	                for(int j=i;j<nums.length-1-k;j++){
	                    nums[j]=nums[j+1];
	                }
	            }
	        }
	        

        }
        
        for(int i=nums.length-1;i>nums.length-zeroCount-1;i--){
        	nums[i]=0;
        }
/*        System.out.println("End");*/
    }
    
    public static void main(String[] args){
/*    	int[] nums=new int[6];
    	nums[0]=0;
    	nums[1]=0;
    	nums[2]=1;
    	nums[3]=0;
    	nums[4]=3;
    	nums[5]=12;*/
    	
    	int[] nums=new int[3];
    	nums[0]=0;
    	nums[1]=1;
    	nums[2]=0;
    	
/*    	int[] nums=new int[3];
    	nums[0]=0;
    	nums[1]=0;
    	nums[2]=1;*/

    	Solution testCase=new Solution();
    	testCase.moveZeroes(nums);
    }
}
