package com.company.Classes;

public class Course {

    //Initializing all the variable
    public String name;
    public int period;
    public double grade;

    //With parameters
    public Course(String givenName, int givenPeriod, double givenGrade){
        name = givenName;
        period = givenPeriod;
        grade = givenGrade;
    }

    //If Someone forgot the parmeters but who would? 0_0
    public Course(){
        name = "";
        period = 0;
        grade = 0;
    }


    //Setting
    public void setName(String givenName){
        name = givenName;
    }
    public void setPeriod(int givenPeriod){
        period = givenPeriod;
    }
    public void setGrade(double givenGrade){
        grade = givenGrade;
    }

    //Getting
    public String getName(){
        return name;
    }
    public int getPeriod(){
        return period;
    }
    public double getGrade(){
        return grade;
    }

}
