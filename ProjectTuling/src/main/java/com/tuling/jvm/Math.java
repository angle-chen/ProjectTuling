package com.tuling.jvm;

public class Math {
    private static final int initData = 666;
    private static User user = new User();

    /**
     * 作者：陈泽 br>
     * 功能：br>
     * 时间：22:25 2021/6/3 br>
     **/
    public int compute(){
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.compute();
    }
}
