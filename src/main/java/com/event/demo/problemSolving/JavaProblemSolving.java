package com.event.demo.problemSolving;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
/*

A string s containing lowercase English letters (1 ≤ length(s) ≤ 300)
A set of strings wordDict representing the dictionary (1 ≤ wordDict.size() ≤ 1000)
Each word in wordDict is a lowercase English word (1 ≤ length(word) ≤ 20)

Input:s = "leetcode"
wordDict = {"leet", "code"}
Output: true
Explanation: The string "leetcode" can be segmented as "leet code".*/

public class JavaProblemSolving {

    public boolean canBreak(String str,Set<String> set){
    return segmented(str);
    }
   public boolean segmented(String str){
        String [] segment = str.split("apple");
        String [] segment2 = str.split("pen");

       ArrayList<String> list = new ArrayList<>();
           list.add(Arrays.toString(segment));
           list.add(Arrays.toString(segment2));
       System.out.println(list);
       /*Arrays.stream(segment)
               .forEach(n -> System.out.println(n));*/
       return true;
    }
    public static void main(String[] args) {
        JavaProblemSolving obj = new JavaProblemSolving();
        String str;
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("pen");
        obj.canBreak("applepenapple",set);
        obj.segmented("applepenapple");
    }
}
