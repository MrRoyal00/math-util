/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoamai.mathutil.core;

/**
 *
 * @author Manh.D.Nguyen
 */
public class MathUtil {
    //Trong class nay cung cap cho ai do nhieu ham xu li toan hoc 
    //clone class Math cua JDK 
    //Do xai chung ma k can luu lai trang thai thi la ham static
    
    //Ham tinh giai thua:
    //n! = 1x2x3x...xn
    //ko co giai thua am
    //0! = 1! = 1 (quy uoc)
    //do thi ham giai thua doc dung, tang nhanh ve gia tri 
    //20! co 18 con so 0, vua du cho kieu 'long' cua java, 21! la tran so cua 'long'
    //bai nay quy uoc tinh n! trong khoang tu 0-> 20
    
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20){
//            throw new IllegalArgumentException("Invalid argument. N must be between 0 to 20");
//        }
//        if(n == 0 || n == 1) return 1;
//        long product = 1;
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }
    
    //Hoc ve de quy 
    //6! = 6 x 5!
    //5! = 5 x 4!
    //...1! = 1. diem dung
    //-> muon tinh n giai thua thi lay n * (n-1)!
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid argument. N must be between 0 to 20");
        }
        if(n == 0 || n == 1) return 1;
        
        return n * getFactorial(n-1);
    }
}
