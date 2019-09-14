package com.shiquanxi.springbootday1.bean;

public class Dag {

    private String dagname;
    private Integer dagage;


    @Override
    public String toString() {
        return "Dag{" +
                "dagname='" + dagname + '\'' +
                ", dayage=" + dagage +
                '}';
    }

    public String getDagname() {
        return dagname;
    }

    public void setDagname(String dagname) {
        this.dagname = dagname;
    }

    public Integer getDagage() {
        return dagage;
    }

    public void setDagage(Integer dagage) {
        this.dagage = dagage;
    }
}
