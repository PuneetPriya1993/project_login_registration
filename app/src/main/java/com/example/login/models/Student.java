package com.example.login.models;

public class Student
{
    private String Sid;
    private String name;
    private String country_name;

    public Student()
    {

    }

    public Student(String sid, String name, String country_name) {
        Sid = sid;
        this.name = name;
        this.country_name = country_name;
    }


    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sid='" + Sid + '\'' +
                ", name='" + name + '\'' +
                ", country_name='" + country_name + '\'' +
                '}';
    }


}
