package com.platzi.javatests.util;


import org.junit.Assert;
import org.junit.Test;

/**
 * assertEquals() nos regresa una excepcion para verificar el contenido del resultado de la
 * class StringUtil
 *
 */

public class StringUtilTest {

    @Test
    public  void repeat_string_once() {


        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3)); //se hizo un inline refactor

    }

    @Test
    public  void repeat_string_multiple_times() {

        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));//se hizo un inline refactor
    }
    @Test
    public  void repeat_string_zero_times() {

        Assert.assertEquals("", StringUtil.repeat("hola", 0));//se hizo un inline refactor
    }

    @Test(expected = IllegalArgumentException.class)
    public  void repeat_string_negative_times() {

        Assert.assertEquals("hola", StringUtil.repeat("hola", -1));//se hizo un inline refactor
    }


}