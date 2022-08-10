package com.example.test;

/**
 * @author jinping.he
 * @DESCRIPTION:
 * @DATE: 2022/8/3 5:11 PM
 */
public class TestT {
    public  int a;


    public static void main(String[] args) {
        TestT test =new TestT();

        TestT testb =test;
        testb.a =10;


        testb = null;

        System.out.println(123);



    }
}
