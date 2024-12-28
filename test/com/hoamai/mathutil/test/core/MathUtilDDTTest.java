/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.hoamai.mathutil.test.core;

import com.hoamai.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Manh.D.Nguyen
 */

//Cau lenh nay la cua JUnit bao rang se loop qua tap data de
//lay cac cap data input|expected nhoi vao ham test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //Ham tra ve mang 2 chieu gom nhieu cap input|expected 
    @Parameterized.Parameters //JUnit se ngam chay loop qua tung dong cua mang
    //de lay ra dc cap data
    //-> @ rat quan trong, no la annotation, de quy uoc dieu gi dien ra
    public static Object[][] initData(){
        return new Integer[][]{
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120}
        };
        //int a[] = {{}, {}, {}}; - mang 1 chieu
    }
    //Gio ta can gan tung value cua cot vao bien tuong ung input, expected
    //de nhoi vao ham
    
    @Parameterized.Parameter(value = 0)
    public int n; //Bien map voi value cua cot 0 cua mang
    @Parameterized.Parameter(value = 1)
    public long expected;//bien map vs gtri cua cot 1
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnWells(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
    
}
