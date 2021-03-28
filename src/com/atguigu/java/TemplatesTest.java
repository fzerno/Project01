package com.atguigu.java;

import com.atguigu.bean.Customer;
import sun.font.FontRunIterator;
import sun.font.PhysicalStrike;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-03-26 15:30
 *
 * IDEA中代码模块所处的位置：setting-Editor-Live Templates/Postfix Completion
 *
 */


public class TemplatesTest {

    //模板六：prsf:可生成private static final
    private static final Customer cust = new Customer();
    //变形：psf
    public static final int num1 = 1;

    //变形：psfi
    public static final int num2 = 1;

    //变形：psfs
    public static final String NATION = "china";

    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println();
        //变形:soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);
        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        //模板三:fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形：iter
        for (String s : arr) {
            System.out.println(s);

        }

        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {

        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //变形list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method(){

        System.out.println("Templates.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        //模板五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn / xxx.null
        if (list != null) {

        }

        if (list == null) {

        }

    }

}
