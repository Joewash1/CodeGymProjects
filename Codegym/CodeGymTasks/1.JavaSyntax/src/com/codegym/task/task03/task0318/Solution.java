package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        InputStream inputStream = System.in;
Reader inputStreamReader = new InputStreamReader(inputStream);
BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
String sAge = bufferedReader.readLine(); 
int nAge = Integer.parseInt(sAge);
String name = bufferedReader.readLine(); 
System.out.print(name);

System.out.print(" will take over the world in ");
System.out.print(nAge);
System.out.print(" years. Mwa-ha-ha!");
    }
}
