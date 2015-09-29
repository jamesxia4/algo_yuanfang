package leetcode204;
import java.io.*;
/*
 *Description:
 *Count the number of prime numbers less than a non-negative number, n.
 * 
 */

public class Solution {
    public static int countPrimes(int n) {
    	if(n==0){
            return 0;
        }
        if(n==1){
            return 0;
        }
        if(n==2){
            return 0;
        }
        else{
            boolean [] isPrime=new boolean[n];
            int count=0;
            for(int i=0;i<n;i++){
                isPrime[i]=true;
            }
            isPrime[0]=false;
            isPrime[1]=false;
            isPrime[2]=true;
            for(int i=4;i<n;i=i+2){
                isPrime[i]=false;
            }
            
            for(int i=3;i<n;i=i+2){
                for(int j=2;i*j<n;j++){
                    isPrime[i*j]=false;
                }
            }
            
            for(int i=0;i<n;i++){
                if(isPrime[i]==true){
                    count++;
                }
            }
            return count;
        }
    }
    public static void main(String[] args)throws Exception{
    	try{
    		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
    		int n=Integer.parseInt(stdin.readLine());
    		System.out.println(countPrimes(n));
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
}