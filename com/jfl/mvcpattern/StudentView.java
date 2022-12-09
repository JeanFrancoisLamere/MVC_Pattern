package com.jfl.mvcpattern;

import static java.lang.System.Logger.Level.INFO;

public class StudentView {

    private static final System.Logger LOGGER = System.getLogger("c.f.b.DefaultLogger");

    public void printStudentDetails(String studentName, String studentRollNo){
        LOGGER.log(INFO,"Student: ");
        LOGGER.log(INFO,"Name: " + studentName);
        LOGGER.log(INFO,"Roll No: " + studentRollNo);
    }
 }