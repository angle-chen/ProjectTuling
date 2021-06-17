package com.tuling.jvm;

import lombok.Data;

@Data
public class User1 {
    private Integer id;
    static {
        System.out.println("************ load User**************");
    }

    @Override
    protected void finalize() throws Throwable {
        //OMMTest.list.add(this);
        System.out.println("关闭资源，user"+id+"即将被回收");
    }

    public void sout(){
        System.out.println("=========另外一个User1版本：自己的加载器加载类调用方法==========");
    }
}
