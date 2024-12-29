/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoamai.mathutil.main;

import com.hoamai.mathutil.core.MathUtil;

/**
 *
 * @author Manh.D.Nguyen
 */
public class Main {
    public static void main(String[] args) {
        //thu nghiem ham tinh giai thua xem chay dung k
        //ta phai dua cac tinh huong su dung ham trong thuc te
        //TEST CASE: Mot tinh huong gia lap ham /tinh nang dc dua vao su dung
        //Test case la mot tinh huong su dung app/ham ma no bao gom:
        //1: data dau vao cu the, 2: output ung voi xu li cua ham/app, dung data dau vao de xu li.
        //3: so sanh de xem ket qua co nhu ki vong hay k. 
        
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}
