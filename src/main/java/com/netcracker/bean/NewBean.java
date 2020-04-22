package com.netcracker.bean;

public class NewBean{

    private String firstname;

    private String surname;


    @Override
    public String toString(){
        return "NewBean{"+
                "firstname='"+firstname+'\''+
                ", surname='"+surname+'\''+
                '}';
    }

    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }
}
