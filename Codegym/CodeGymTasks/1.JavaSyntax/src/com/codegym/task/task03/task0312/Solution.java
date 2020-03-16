package com.codegym.task.task03.task0312;

/* 
Time conversion

*/

public class Solution {
    //write your code here
    public static int convertToSeconds(int hour)
    {
        int seconds = ((hour * 60) * 60);
return seconds;
    }
    public static void main(String[] args) {
        //write your code here
        int hour;
        System.out.println(convertToSeconds(hour));
    }
}
