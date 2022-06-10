package com.company.Classes;

public class Driver {
    //Driving everything?
    
    //Making some courses
    Course Geo = new Course(); //It was me
    Course English = new Course(); //I did it
    Course Java = new Course();//I forgot the parmeters

    //Course to replace with later
    Course Physics = new Course("physics", 6, 96);

    public Driver(){
        //Testing the sets and the gets from Course
        Geo.setName("math");
        Geo.setPeriod(5);
        Geo.setGrade(87.00);

        English.setName("english");
        English.setPeriod(6);
        English.setGrade(90);

        Java.setName("java");
        Java.setPeriod(5);
        Java.setGrade(97.00);


        //Schedule Testing Time
        Schedule calender = new Schedule(Geo, English, Java);

        calender.displayAllPassing(90.00); //Should print out English and Java

        calender.replace(Physics); //Should change English to Physics

        calender.displayAllPassing(90.00); //Should display Java and Physics

        calender.study(true); //Should raise all grades

        calender.displayAllPassing(90.00); //Should display Java, Physics and Geo

        calender.study(false); //Should bring down grades
        calender.study(false); //Should bring down grades

        calender.displayAllPassing(90.00); //Should display nothing
    }



}
