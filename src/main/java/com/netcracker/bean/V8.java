package com.netcracker.bean;


public class V8 implements IEngine {

    private String drive = "V8.drive";

    @Override
    public void drive() {
        System.out.println(this.drive);
    }

    @Override
    public String toString(){
        return
                drive+'\'';

    }
}
