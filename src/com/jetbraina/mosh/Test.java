package com.jetbraina.mosh;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class Test {

    public static void main(String[] arg){

    int prev = Integer.MIN_VALUE / 2;
    String S = "loveleetcode";
    char c = 'e';

    int n = S.length();
    int[] output = new int[n];

    for(int i=0;i<n;i++){
        if(S.charAt(i) ==c){
            prev =i;
        }
        System.out.println(output[i] == prev);
    }

}
}


