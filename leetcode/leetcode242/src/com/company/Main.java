package com.company;
import java.util.*;

public class Main {
    //Leetcode242
    public boolean isAnagram(String s, String t) {
        //题设里提示了不用考虑大小写和其他符号，我还真没考虑到
        Map<Character,Integer> keyMap=new LinkedHashMap<Character, Integer>();
        keyMap.put('a',0);
        keyMap.put('b',1);
        keyMap.put('c',2);
        keyMap.put('d',3);
        keyMap.put('e',4);
        keyMap.put('f',5);
        keyMap.put('g',6);
        keyMap.put('h',7);
        keyMap.put('i',8);
        keyMap.put('j',9);
        keyMap.put('k',10);
        keyMap.put('l',11);
        keyMap.put('m',12);
        keyMap.put('n',13);
        keyMap.put('o',14);
        keyMap.put('p',15);
        keyMap.put('q',16);
        keyMap.put('r',17);
        keyMap.put('s',18);
        keyMap.put('t',19);
        keyMap.put('u',20);
        keyMap.put('v',21);
        keyMap.put('w',22);
        keyMap.put('x',23);
        keyMap.put('y',24);
        keyMap.put('z',25);
        int[]  keyCountS=new int[26];
        int[]  keyCountT=new int[26];
        for(int i=0;i<s.length();i++){
            keyCountS[keyMap.get(s.charAt(i))]++;
        }
        for(int i=0;i<t.length();i++){
            keyCountT[keyMap.get(t.charAt(i))]++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(keyCountS[i]==keyCountT[i]){
                ++count;
            }
        }
        if(count==26){
            return true;
        }else{
            return false;
        }
    }
}