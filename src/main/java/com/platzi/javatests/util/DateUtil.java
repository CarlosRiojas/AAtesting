package com.platzi.javatests.util;

public class DateUtil {

    public static boolean isLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0)){ //opte por no refactorizar oara indicar proceso.

        return true;

        }else{

            return false;
        }

    }

}
