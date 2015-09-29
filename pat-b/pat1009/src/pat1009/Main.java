package pat1009;
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		try{
			String inputString=stdin.readLine();
			String[] outputs=inputString.split(" ");
			String outputString="";
			for(int i=outputs.length-1;i>=0;i--){
				outputString=outputString+outputs[i]+" ";
			}
			outputString=outputString.trim(); //这个是传值调用！
			System.out.print(outputString);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
