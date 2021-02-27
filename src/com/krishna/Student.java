package com.krishna;

import java.util.*;

public class Student {
    int studentId;
    String firstName;
    String lastName;
    Date birthDate;
    Gender gender;
    String city;
    String pincode;
    String cellPhone;
    String email;
    String department;
    float marks[];
    float totalMarks;
    float percentage;
    String grade;

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId, String firstName, String lastName, Date birthDate, Gender gender, String city, String pincode, String cellPhone, String email, String department, float[] marks) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.city = city;
        this.pincode = pincode;
        this.cellPhone = cellPhone;
        this.email = email;
        this.department = department;
        this.marks = marks;
    }



    public int getStudentId() {
        return studentId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  String  getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    private void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    private void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    private void setGrade(String grade) {
        this.grade = grade;
    }

    public  void calculateTotalMarks(){
        float total = 0.0f;
        for(int i = 0; i<marks.length; i++){
            total+=marks[i];
        }
        setTotalMarks(total);
    }

    public  void calculatePer(){
        this.percentage = this.totalMarks/ marks.length;
    }

    public  void calculateGrade(){
        if (this.percentage>=95.0){
            this.grade = "A+";
        } else if (this.percentage>=87.0){
            this.grade = "A";
        } else if (this.percentage>=80.0){
            this.grade = "A-";
        } else if (this.percentage>=77.0){
            this.grade = "B+";
        } else if (this.percentage>=73.0){
            this.grade = "B";
        } else if (this.percentage>=70.0){
            this.grade = "B-";
        } else if (this.percentage>=67.0){
            this.grade = "C+";
        } else if (this.percentage>=63.0){
            this.grade = "C";
        } else if (this.percentage>=60.0){
            this.grade = "C-";
        } else if (this.percentage>=50.0){
            this.grade = "D";
        } else {
            this.grade = "F";
        }




    }

    public void displaydata(){

    }
}
