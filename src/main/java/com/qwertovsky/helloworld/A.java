package com.qwertovsky.helloworld;

public class A {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    public static void main(String[] args) {
        BA b = new BA();
        b.setStr("b");
        System.out.println(b.getStr());
    }
}

 class BA extends A {
    BA(){
       super.getStr();
    }
}