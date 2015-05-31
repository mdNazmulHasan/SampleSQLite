package com.nerdcastle.nazmulhasan.samplesqlite;

/**
 * Created by nazmulHasan on 5/31/2015.
 */
public class StudentsModel {

    public int id;
    public String name;
    public String phone_number;

    public StudentsModel(int id, String name, String phone_number) {
        // TODO Auto-generated constructor stub
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
    }
    public StudentsModel(){

    }
}