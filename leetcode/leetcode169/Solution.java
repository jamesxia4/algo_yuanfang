import java.util.*;

//http://www.cnblogs.com/fanyabo/p/4178993.html
//http://blog.csdn.net/feliciafay/article/details/42077071
//https://leetcode.com/discuss/19151/solution-computation-space-problem-can-extended-situation

public class Solution {
    public int majorityElement(int[] nums) {
        //Hashtable解法, O(n)时间复杂度，O(n)空间复杂度
        //操你大爷还真没想到会有这种输入[-1,-1,2147483647]
        //他妈还只能用ArrayList解决了操你大爷
        //上一条不行，ArrayList.get接口不能适配Long，还是用Map.
        Map<Integer,Integer> numCnt=new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(!numCnt.containsKey(nums[i])){
                numCnt.put(nums[i],1);
            }else{
                Integer numCntValue=numCnt.get(nums[i]);
                numCnt.put(nums[i],++numCntValue);
            }
        }

        Integer rtnFactor=0;
        //JDK 1.5+
        for(Map.Entry<Integer,Integer> entry:numCnt.entrySet()){
            if(entry.getValue()>nums.length/2){
                rtnFactor=entry.getKey();
                break;
            }
        }
        return rtnFactor;
    }
}