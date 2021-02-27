package com.krishna;

import java.util.*;

public class Sample {
    public static  void main (String args[]){

        float[] Krishna = {80,80,80,80,80};

        Student student = new Student(
                796378,
                "Krishna",
                "Patel",
                new Date(),
                Gender.MALE,
                 "String city",
                "String pinCode",
                "String cellPhone",
                "String email",
                "String department" ,
                Krishna);
        student.displaydata();

    }
}
