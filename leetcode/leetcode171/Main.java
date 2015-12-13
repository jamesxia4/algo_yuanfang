import java.util.*;
import java.math.*;
import java.io.*;
public class Main {
    public int titleToNumber(String s) {
        Map<Character,Integer> keyMap=new LinkedHashMap<Character,Integer>();
        String templateString="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<templateString.length();i++){
            keyMap.put(templateString.charAt(i),i+1);
        }
        Integer rowNum=0;
        for(int i=0;i<s.length();i++){
            rowNum+=keyMap.get(s.charAt(i))*(Math.round((float)(Math.pow(26,s.length()-1-i))));
        }
        return rowNum;
    }
}