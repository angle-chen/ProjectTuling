package com.tuling.jvm;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    static {
        System.out.println("************ load User**************");
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {

    }

    @Override
    protected void finalize() throws Throwable {
        //OMMTest.list.add(this);
        System.out.println("关闭资源，user"+id+"即将被回收");
    }

    public void sout(){
        System.out.println("=========自己的加载器加载类调用方法==========");
    }
}
