package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtil {


    public static boolean isEmpty(String str){

          return str ==  null || str.trim().length() <= 0 ;

    }

@Test
    public void is_not_empty(){
       Assert.assertFalse(StringUtil.isEmpty("algo"));

    }


    @Test
    public void emptyValue_is_Empty(){
        Assert.assertTrue(StringUtil.isEmpty(""));

    }

    @Test
    public void Null_is_Empty(){
        Assert.assertTrue(StringUtil.isEmpty(null));

    }

    public static String repeat(String str, int times){
        if(times < 0){
            throw new IllegalArgumentException("negative times not allowed");

        }


       String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
