package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        System.out.print(name);
        String sYears = bufferedReader.readLine();
        int nYears = Integer.parseInt(sYears);
        System.out.print(" will receive " + nYears);
        String snumb = bufferedReader.readLine();
        int nNumb = Integer.parseInt(snumb);
        System.out.print(" in " + nNumb + " years.");
    }
}
