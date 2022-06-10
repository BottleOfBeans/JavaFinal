package com.company.Classes;

public class Schedule {
    public Course courseArray[] = new Course[3];

    //With Parameters
    public Schedule(Course course1, Course course2, Course course3){
        courseArray[0] = course1;
        courseArray[1] = course2;
        courseArray[2] = course3;
    }

    //Without Parameters
    public Schedule(){
        ; //Nothing happens
    }

    //Custom Methods
    public void displayAllPassing(double passing){
        System.out.println("==================\nPassing Grades");
        for(int x = 0; x<courseArray.length; x++){
            if(courseArray[x].getGrade()>=passing){
                System.out.println(courseArray[x].getName() + " : " + courseArray[x].getGrade());
            }
        }
        System.out.println("==================\n");
    }

    public void replace(Course newcourse){
        for(int x = 0; x<courseArray.length; x++){
            if(courseArray[x].getPeriod()>=newcourse.getPeriod()){
                courseArray[x] = newcourse;
            }
        }
    }

    public void study(boolean didStudy){
        for(int x = 0; x<courseArray.length; x++){
            if(!didStudy){
                if(courseArray[x].getGrade()>10){
                    courseArray[x].setGrade(courseArray[x].getGrade()-10);
                }else{
                    courseArray[x].setGrade(0);
                }
            }else{
                if(courseArray[x].getGrade()<90){
                    courseArray[x].setGrade(courseArray[x].getGrade()+10);
                }else{
                    courseArray[x].setGrade(100);
                }
            }
        }
    }
}
