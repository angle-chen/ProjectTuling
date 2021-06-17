package com.tuling.jvm;

public class StackOverflowTest {
    // JVM设置
    // -Xss128k,-Xss默认1M
    static int count = 0;
    static void redo(){
        count++;
        redo();
    }

    public static void main(String[] args) {
        try{
            redo();
        }catch (Throwable t){
            t.printStackTrace();
            System.out.println("count:"+count);
        }
    }
}
