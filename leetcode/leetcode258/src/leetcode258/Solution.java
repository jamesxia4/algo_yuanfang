package leetcode258;

//https://en.wikipedia.org/wiki/Digital_root
public class Solution {
    public static int addDigits(int num) {
        if(num/10==0){
            return num;
        }
        else{
            int sum=0;
            String strNum=((Integer)num).toString();
            for(int i=0;i<strNum.length();i++){
                sum=sum-48+(int)(strNum.charAt(i));
            }
            return addDigits(sum);
        }
    }
    public static void main(String[] args){
    	System.out.println(addDigits(38));
    }
}
