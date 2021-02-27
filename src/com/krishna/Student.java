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
        float percentage = 0.0f;
        percentage = totalMarks/5;
        setPercentage(percentage);
    }

    public  void calculateGrade(){
        float percentage = 0.0f;
        percentage = getPercentage();
        String grade = "";

        if (percentage >= 94 && percentage<100){
            grade = "A+";
        } else if (percentage >= 87 && percentage<=93){
            grade = "A";
        }else if (percentage >= 80 && percentage<=86){
            grade = "A-";
        }else if (percentage >= 77 && percentage<=79){
            grade = "B+";
        }else if (percentage >= 73 && percentage<=76){
            grade = "B";
        }else if (percentage >= 70 && percentage<=72){
            grade = "B-";
        }else if (percentage >= 67 && percentage<=69){
            grade = "C+";
        }else if (percentage >= 63 && percentage<=66){
            grade = "C";
        }else if (percentage >= 60 && percentage<=62){
            grade = "C-";
        }else if (percentage >= 50 && percentage<=59){
            grade = "D";
        }else {
            grade = "F";
        }

        setGrade(grade);

    }
}
