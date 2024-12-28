/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hoamai.mathutil.test.core;

import com.hoamai.mathutil.core.MathUtil;
import java.beans.ExceptionListener;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Manh.D.Nguyen
 */
public class MathUtilTest {
    //day la class se su dung cac ham cua thu vien/framework JUnit 
    //de kiem thu/kiem tra code chinh ben core.MathUtil
    //Tinh huong 1: Dua data tu te (0-20)
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0;
        long expected = 1; 
        long actual = MathUtil.getFactorial(n);
        
        //so sanh dung framework xanh-do
        //Ham giup so sanh 2 gia tri nao do co giong nhau k, 
        //neu co -> xanh, code ngon cho case dang test
        //neu k -> do, expected va actual k giong nhau
        //sai do cai nao thi tinh sau
        Assert.assertEquals(expected, actual);
        
        //gop them vai case hop le nua
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
    }
    
    //Tinh huong 2: Dua data sai, thiet ke cua ham la nem ra exception
    //Neu nhap n < 0 || n > 20 va ham nem ra exception -> mau xanh xuat hien
    //Nguoc lai ham k nem ra ngoai le thi phai xuat hien mau do 
    //Test case: input -5 -> expected: illegalArgumentException xuat hien
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowException(){
        MathUtil.getFactorial(-5);//Ham @Test chay se nem ve ngoai le NumberFormat       
    } 
    
    //Lamda version
    //Test case: nem exception neu nhap vao 21
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_LamdaVer(){
//        Assert.assertThrows(tham so 1: loai exception muon so sanh, 
//                            tham so 2: doan code chay nem ra exceptioin runnable)
        Assert.assertThrows(IllegalArgumentException.class, 
                  () -> MathUtil.getFactorial(21));
        //MathUtil.getFactorial(21);
    } 
    
    //Bat ngoai le kieu try-catch
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_TryCatch(){
        try {
            MathUtil.getFactorial(21);
        } catch (Exception e) {
            Assert.assertEquals("Invalid argument. N must be between 0 to 20", 
                    e.getMessage());
        }
    } 
}
