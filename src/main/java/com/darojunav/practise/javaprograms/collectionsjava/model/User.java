package com.darojunav.practise.javaprograms.collectionsjava.model;

public class User {

    String fname;
    String lname;
    String rollno;

    public User(String fname, String lname, String rollno) {
        this.fname = fname;
        this.lname = lname;
        this.rollno = rollno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }


    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }
}
