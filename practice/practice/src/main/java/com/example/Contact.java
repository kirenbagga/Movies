package com.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String name;
    private String phonNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phonNumber, String birthDate) {
        this.name = name;
        this.phonNumber = phonNumber;
        this.birthDate = birthDate;
        this.age=toAge(birthDate);
        
    }
    public Contact(Contact source){
        this.name = source.name;
        this.phonNumber = source.phonNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;

    }
     public int toAge(String birthDate){

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate=LocalDate.parse(birthDate,formatter);
        LocalDate currentDate=LocalDate.now();
        Period period=Period.between(localDate, currentDate);
        return period.getYears();
            
        }
    public void setBirthDate(String birthDate) {
        this.birthDate=birthDate;
        setAge(birthDate);
        

    }
    private void setAge(String age) {
        this.age=toAge(age);


    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonNumber() {
        return this.phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    public String getBirthDate() {
        return this.birthDate;
    }


    public int getAge() {
        return this.age;
    }


   
    public String toString() {
        return "{" +
            " name='" + this.name + "'" +
            ", phonNumber='" + this.phonNumber + "'" +
            ", birthDate='" + this.birthDate + "'" +
            ", age='" + this.age + "'" +
            "}";
    }


    
}
